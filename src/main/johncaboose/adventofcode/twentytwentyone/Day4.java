package johncaboose.adventofcode.twentytwentyone;

import java.util.*;

public class Day4 implements ISolvableDay {

    private interface IBingoable {
        boolean hasBingo();
    }

    private interface ISumable {
        int getUnmarkedNumberSum();
    }

    private interface MapThatStoresDefault<K, V> extends Map<K, V> {

        @Override
        default V getOrDefault(Object key, V defaultValue) {
            V returnValue = Map.super.getOrDefault(key, defaultValue);
            if (get(key) == null) {
                this.put((K) key, returnValue);
            }
            return returnValue;
        }
    }

    private static class HashMapThatStoresDefault<K, V> extends HashMap<K, V> implements MapThatStoresDefault<K, V> {


        @Override
        public V getOrDefault(Object key, V defaultValue) {
            return MapThatStoresDefault.super.getOrDefault(key, defaultValue);
        }
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
            List<BingoableSequence> rowsOnly = boardSequences.subList(0, 5);
            int sum = 0;
            for (BingoableSequence sequence : rowsOnly) {
                sum += sequence.getUnmarkedNumberSum();
            }
            return sum;
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
    }


    @Override
    public long partOneSolver(String input) {
        List<Integer> drawSequence = new ArrayList<>();
        List<BingoBoard> allBoards = new ArrayList<>();
        MapThatStoresDefault<Integer, BoardNumber> allBoardNumbers = new HashMapThatStoresDefault<>();

        //Read input and populate data
        try (Scanner scanner = new Scanner(input)) {
            readDrawSequence(drawSequence, scanner);
            readAllBingoBoards(allBoards, allBoardNumbers, scanner);
        }

        //With all boards read, we can now find out the winning board
        for (int drawnNumber : drawSequence) {
            allBoardNumbers.getOrDefault(drawnNumber, new BoardNumber(drawnNumber)).setMarked(true);

            for (BingoBoard board : allBoards) {
                if (board.hasBingo()) {
                    int winningBoardsScore = board.getUnmarkedNumberSum() * drawnNumber;
                    return winningBoardsScore;
                }
            }

        }

        //No bingo
        return 0;
    }

    /**
     * Reads the draw sequence, found on the first row of the input
     *
     * @param drawSequence
     * @param scanner
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
     * @param allBoards
     * @param allBoardNumbers
     * @param scanner
     */
    private void readAllBingoBoards(List<BingoBoard> allBoards, Map<Integer, BoardNumber> allBoardNumbers, Scanner scanner) {
        int amountOfNumbersHandled = 0;
        MapThatStoresDefault<Integer, BingoableSequence> rows = new HashMapThatStoresDefault<>();
        MapThatStoresDefault<Integer, BingoableSequence> columns = new HashMapThatStoresDefault<>();
        while (scanner.hasNextInt()) {
            int currentNumber = scanner.nextInt();
            BoardNumber currentBoardNumber = allBoardNumbers.getOrDefault(currentNumber, new BoardNumber(currentNumber));

            BingoableSequence currentRow = rows.getOrDefault(amountOfNumbersHandled / 5, new BingoableSequence());
            BingoableSequence currentColumn = columns.getOrDefault(amountOfNumbersHandled % 5, new BingoableSequence());

            currentRow.addNumber(currentBoardNumber);
            currentColumn.addNumber(currentBoardNumber);


            amountOfNumbersHandled++;

            if (amountOfNumbersHandled % 25 == 0) {
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
        return 0;
    }


}
