package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.shared.ExtendedMap;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Day4 implements ISolvableDay {

    /**
     * This is the same as the number of columns
     */
    private static final int NUMBER_OF_ROWS = 5;
    private static final int NUMBER_OF_BINGO_CARD_ELEMENTS = NUMBER_OF_ROWS * NUMBER_OF_ROWS;

    private interface IBingoable {
        boolean hasBingo();
    }

    private interface ISumable {
        int getUnmarkedNumberSum();
    }

    private static class BingoBoard implements IBingoable {
        List<BingoableSequence> boardSequences;

        public BingoBoard(List<BingoableSequence> boardSequences) {
            this.boardSequences = new ArrayList<>(boardSequences);
        }


        @Override
        public boolean hasBingo() {
            for (IBingoable bingoable : boardSequences) {
                if (bingoable.hasBingo()) {
                    return true;
                }
            }
            return false;
        }

        public int getUnmarkedNumberSum() {
            //Don't count same number twice
            List<BingoableSequence> rowsOnly = boardSequences.subList(0, NUMBER_OF_ROWS);
            int sum = 0;
            for (BingoableSequence sequence : rowsOnly) {
                sum += sequence.getUnmarkedNumberSum();
            }
            return sum;
        }

        public int getFinalScore(int lastDrawnNumber) {
            return getUnmarkedNumberSum() * lastDrawnNumber;
        }

        @Override
        public String toString() {
            return "BingoBoard{" +
                   "boardSequences=" + boardSequences +
                   '}';
        }
    }

    private static class BingoableSequence implements IBingoable, ISumable {
        private List<BoardNumber> numberSequence = new ArrayList<>();

        public void addNumber(BoardNumber boardNumber) {
            numberSequence.add(boardNumber);
        }

        @Override
        public boolean hasBingo() {
            for (BoardNumber boardNumber : numberSequence) {
                if (!boardNumber.getMarked()) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int getUnmarkedNumberSum() {
            int sum = 0;
            for (BoardNumber number : numberSequence) {
                sum += number.getUnmarkedNumberSum();
            }
            return sum;
        }

        @Override
        public String toString() {
            return "BingoableSequence{" +
                   "numberSequence=" + numberSequence +
                   '}';
        }
    }

    private static class BoardNumber implements ISumable {
        private final int number;
        private boolean marked = false;

        public BoardNumber(int number) {
            this.number = number;
        }

        public boolean getMarked() {
            return marked;
        }

        public void setMarked(boolean marked) {
            this.marked = marked;
        }

        @Override
        public int getUnmarkedNumberSum() {
            return !marked ? number : 0;
        }

        @Override
        public String toString() {
            return "BoardNumber{" +
                   "number=" + number +
                   ", marked=" + marked +
                   '}';
        }
    }


    @Override
    public long partOneSolver(String input) {
        List<Integer> drawSequence = new ArrayList<>();
        List<BingoBoard> allBoards = new ArrayList<>();
        ExtendedMap<Integer, BoardNumber> allBoardNumbers = new ExtendedHashMap<>();

        //Read input and populate data
        try (Scanner scanner = new Scanner(input)) {
            readDrawSequence(drawSequence, scanner);
            readAllBingoBoards(allBoards, allBoardNumbers, scanner);
        }

        //With all boards read, we can now find out the winning board
        for (int drawnNumber : drawSequence) {
            allBoardNumbers.getOrStoreDefault(drawnNumber, new BoardNumber(drawnNumber)).setMarked(true);

            for (BingoBoard board : allBoards) {
                if (board.hasBingo()) {
                    return board.getFinalScore(drawnNumber);
                }
            }

        }

        //No bingo
        return 0;
    }

    /**
     * Reads the draw sequence, a comma-separated list of integers found on the next line of the scanner
     *
     * @param drawSequence list that will be populated with the comma-separated integers found with the scanner
     * @param scanner      one line of this scanner will be read
     */
    private void readDrawSequence(List<Integer> drawSequence, Scanner scanner) {
        //First read the comma-separated bingo numbers, all found on the first row
        String firstRow = scanner.nextLine();
        String[] allNumbers = firstRow.split(",");
        for (String s : allNumbers) {
            drawSequence.add(Integer.parseInt(s));
        }
    }

    /**
     * Reads all bingo boards, every 25 numbers make up one board (they're 5x5)
     *
     * @param allBoards       list that will be populated with all bingo boards read from the scanner
     * @param allBoardNumbers all scanned numbers in the BoardNumber representation
     * @param scanner         scanner where the next token is the first number of the first bingo board
     */
    private void readAllBingoBoards(List<BingoBoard> allBoards, ExtendedMap<Integer, BoardNumber> allBoardNumbers, Scanner scanner) {
        int amountOfNumbersHandled = 0;
        ExtendedMap<Integer, BingoableSequence> rows = new ExtendedHashMap<>();
        ExtendedMap<Integer, BingoableSequence> columns = new ExtendedHashMap<>();
        while (scanner.hasNextInt()) {
            int currentNumber = scanner.nextInt();
            BoardNumber currentBoardNumber = allBoardNumbers.getOrStoreDefault(currentNumber, new BoardNumber(currentNumber));

            BingoableSequence currentRow = rows.getOrStoreDefault(amountOfNumbersHandled / NUMBER_OF_ROWS, new BingoableSequence());
            BingoableSequence currentColumn = columns.getOrStoreDefault(amountOfNumbersHandled % NUMBER_OF_ROWS, new BingoableSequence());

            currentRow.addNumber(currentBoardNumber);
            currentColumn.addNumber(currentBoardNumber);


            amountOfNumbersHandled++;

            if (amountOfNumbersHandled % NUMBER_OF_BINGO_CARD_ELEMENTS == 0) {
                // Board complete, assemble it
                List<BingoableSequence> boardContents = new ArrayList<>();
                boardContents.addAll(rows.values());
                boardContents.addAll(columns.values());

                allBoards.add(new BingoBoard(boardContents));

                // Reset
                amountOfNumbersHandled = 0;
                rows.clear();
                columns.clear();
            }
        }
    }


    @Override
    public long partTwoSolver(String input) {
        List<Integer> drawSequence = new ArrayList<>();
        List<BingoBoard> allBoards = new ArrayList<>();
        ExtendedMap<Integer, BoardNumber> allBoardNumbers = new ExtendedHashMap<>();

        //Read input and populate data
        try (Scanner scanner = new Scanner(input)) {
            readDrawSequence(drawSequence, scanner);
            readAllBingoBoards(allBoards, allBoardNumbers, scanner);
        }

        //With all boards read, we can now find out which board is worst
        for (int drawnNumber : drawSequence) {
            allBoardNumbers.getOrStoreDefault(drawnNumber, new BoardNumber(drawnNumber)).setMarked(true);

            //Filter out boards until one left
            if (allBoards.size() > 1) {
                allBoards = allBoards.stream().filter(board -> !board.hasBingo()).collect(Collectors.toList());
            }

            if (allBoards.size() == 1 && allBoards.get(0).hasBingo()) {
                return allBoards.get(0).getFinalScore(drawnNumber);
            }

        }

        //No bingo
        return 0;
    }


}
