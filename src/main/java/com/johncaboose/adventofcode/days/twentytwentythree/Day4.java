package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.LongStream;

class Day4 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day4.class);

    @Override
    public Long partOneSolver(String input) {
        List<Card> cards = parseInput(input);
        return cards.stream()
                .mapToLong(Card::points)
                .sum();
    }

    @Override
    public Long partTwoSolver(String input) {
        List<Card> cards = parseInput(input);

        Map<Long, Long> cardAmounts = new HashMap<>();
        for (Card card : cards) {
            cardAmounts.put(card.id(), 1L);
        }

        long lastId = cards.reversed().get(0).id();
        for (Card card : cards) {
            boolean winningTicket = !card.correctNumbers().isEmpty();
            if (winningTicket) {
                //Create the winning tickets generated and update their amounts
                long amountToGenerate = cardAmounts.get(card.id());
                List<Long> idsToGenerate = card.idsToGenerate(lastId);
                for (long id : idsToGenerate) {
                    long currentlyHeld = cardAmounts.get(id);
                    currentlyHeld += amountToGenerate;
                    cardAmounts.put(id, currentlyHeld);
                }
            }
        }

        return cardAmounts.values()
                .stream()
                .mapToLong(Long::longValue)
                .sum();
    }

    private record Card(Long id, List<Long> winningNumbers, List<Long> heldNumbers) {

        public long points() {
            Set<Long> correct = correctNumbers();

            int amountOfWinningNumbersHeld = correct.size();
            if (amountOfWinningNumbersHeld == 0) {
                return 0;
            }

            return BigDecimal.valueOf(2)
                    .pow(amountOfWinningNumbersHeld - 1)
                    .longValueExact();
        }

        public Set<Long> correctNumbers() {
            Set<Long> correct = new HashSet<>(winningNumbers);
            correct.retainAll(heldNumbers);
            return correct;
        }

        public List<Long> idsToGenerate(long lastId) {
            Set<Long> correct = correctNumbers();
            int amountOfWinningNumbersHeld = correct.size();
            if (amountOfWinningNumbersHeld == 0) {
                return List.of();
            }
            if (id() == lastId) {
                return List.of();
            }
            long startId = this.id + 1;
            long endId = Math.min(lastId, this.id + amountOfWinningNumbersHeld);

            return LongStream.rangeClosed(startId, endId).boxed().toList();
        }

    }

    private static List<Card> parseInput(String input) {
        List<Card> cards = new ArrayList<>();
        Pattern cardPattern = Pattern.compile("Card *(?<id>\\d+): (?<winning>.+) \\| (?<held>.+)");
        Matcher matcher = cardPattern.matcher(input);
        while (matcher.find()) {
            String cardId = matcher.group("id");
            String winningNumbers = matcher.group("winning");
            String heldNumbers = matcher.group("held");

            Card card = new Card(
                    Long.parseLong(cardId),
                    Utils.populateListWithLongs(winningNumbers),
                    Utils.populateListWithLongs(heldNumbers)
            );
            cards.add(card);
        }
        return cards;
    }


}
