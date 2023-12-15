package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.exceptions.ParseException;
import com.johncaboose.adventofcode.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Day7 implements ISolvableDay<Long> {

    private static final Logger log = LogManager.getLogger(Day7.class);

    @Override
    public Long partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, true);
    }

    private static long solve(String input, boolean joker) {
        List<Hand> allHands = parseInput(input);

        Comparator<Hand> comparator = Comparator.comparingLong(joker ? Hand::jokerScore : Hand::score);

        List<Hand> sortedHands = allHands.stream()
                .sorted(comparator)
                .toList();

        long totalWinnings = 0;
        for (int i = 0; i < sortedHands.size(); i++) {
            Hand hand = sortedHands.get(i);
            long rank = i + 1;
            long handWinning = hand.bid * rank;
            log.trace("Hand {}, rank: {}, winnings: {}", hand, rank, handWinning);
            totalWinnings += handWinning;
        }

        return totalWinnings;
    }

    private record Hand(List<Card> cards, long bid, long score, long jokerScore) {

        private static final List<Long> MULTIPLIER = List.of(
                10_00_00_00_00L,
                10_00_00_00L,
                10_00_00L,
                10_00L,
                10L
        );

        public Hand(List<Card> cards, long bid) {
            this(cards, bid, score(cards, false), score(cards, true));
        }

        private static long score(List<Card> cards, boolean joker) {
            HandType type = HandType.ofHand(cards, joker);
            long handTypeScore = 1_000_000_000_000_000L * type.getStrength();

            long singleCardScore = 0;
            for (int i = 0; i < cards.size(); i++) {
                singleCardScore += MULTIPLIER.get(i) * cards.get(i).getStrength(joker);
            }

            return handTypeScore + singleCardScore;
        }
    }

    private enum HandType {
        FIVE_OF_A_KIND(7),
        FOUR_OF_A_KIND(6),
        FULL_HOUSE(5),
        THREE_OF_A_KIND(4),
        TWO_PAIR(3),
        ONE_PAIR(2),
        HIGH_CARD(1);

        private final long strength;

        HandType(long strength) {
            this.strength = strength;
        }

        public static HandType ofHand(List<Card> cards, boolean jokersExist) {
            ExtendedHashMap<Card, Integer> cardCounts = new ExtendedHashMap<>();
            int jokersCount = 0;
            for (Card card : cards) {
                if (card.isJoker(jokersExist)) {
                    jokersCount++;
                } else {
                    int newCount = 1 + cardCounts.getOrDefault(card, 0);
                    cardCounts.put(card, newCount);
                }
            }

            List<Integer> orderedCounts = cardCounts.values().stream()
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));

            int maxCount = !orderedCounts.isEmpty() ? orderedCounts.removeLast() : 0;
            int secondToMaxCount = !orderedCounts.isEmpty() ? orderedCounts.removeLast() : 0;

            if (maxCount + jokersCount == 5) {
                return FIVE_OF_A_KIND;
            }
            if (maxCount + jokersCount == 4) {
                return FOUR_OF_A_KIND;
            }
            if (maxCount + secondToMaxCount + jokersCount == 5) {
                return FULL_HOUSE;
            }
            if (maxCount + jokersCount == 3) {
                return THREE_OF_A_KIND;
            }
            if (maxCount + secondToMaxCount + jokersCount == 4) {
                return TWO_PAIR;
            }
            if (maxCount + jokersCount == 2) {
                return ONE_PAIR;
            }
            return HIGH_CARD;
        }

        public long getStrength() {
            return strength;
        }
    }

    private enum Card {
        A("A", 14),
        K("K", 13),
        Q("Q", 12),
        J("J", 11),
        T("T", 10),
        NINE("9", 9),
        EIGHT("8", 8),
        SEVEN("7", 7),
        SIX("6", 6),
        FIVE("5", 5),
        FOUR("4", 4),
        THREE("3", 3),
        TWO("2", 2);

        private static final int JOKER_STRENGTH = 1;
        private final String character;
        private final long strength;

        Card(String character, long strength) {
            this.character = character;
            this.strength = strength;
        }

        public boolean isJoker(boolean jokersExist) {
            return jokersExist && this.equals(J);
        }

        public long getStrength(boolean jokersExist) {
            if (isJoker(jokersExist)) {
                return JOKER_STRENGTH;
            }
            return strength;
        }

        @Override
        public String toString() {
            return character;
        }
    }

    private static List<Hand> parseInput(String input) {
        Scanner scanner = new Scanner(input);
        List<Hand> hands = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String handString = line.substring(0, 5);
            String bidString = line.substring(6);

            List<Card> cards = parseCards(handString);
            long bid = Long.parseLong(bidString);
            Hand hand = new Hand(cards, bid);
            hands.add(hand);
        }
        return List.copyOf(hands);
    }

    private static List<Card> parseCards(String handString) {
        if (handString.length() != 5) {
            throw new ParseException("Cards must be 5 characters long");
        }
        List<Card> cards = new ArrayList<>();
        for (char c : handString.toCharArray()) {
            String cardCharacter = String.valueOf(c);
            Card card = parseCard(cardCharacter);
            cards.add(card);
        }
        return List.copyOf(cards);
    }

    private static Card parseCard(String cardCharacter) {
        Card card = null;
        for (Card c : Card.values()) {
            if (c.character.equals(cardCharacter)) {
                card = c;
            }
        }
        if (card == null) {
            throw new ParseException("Could not convert to card:" + cardCharacter);
        }
        return card;
    }


}
