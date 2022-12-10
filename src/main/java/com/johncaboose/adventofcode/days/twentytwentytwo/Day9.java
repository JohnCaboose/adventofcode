package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;

class Day9 implements ISolvableDay<Long> {

    @Override
    public Long partOneSolver(String input) {
        return solve(input, 2);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, 10);
    }

    private long solve(String input, int knotCount) {
        Coordinate origin = new Coordinate(0, 0);
        Knot tail = new Knot(origin, null);
        Knot head = tail;
        for (int i = 1; i < knotCount; i++) {
            head = new Knot(origin, head);
        }
        Rope rope = new Rope(head);

        List<Move> moves = parseInput(input);
        Set<Coordinate> tailVisited = new HashSet<>();
        tailVisited.add(tail.position());
        for (Move move : moves) {
            rope.performMove(tail, tailVisited, move);
        }
        return tailVisited.size();
    }

    private record Rope(Knot head) {

        public void performMove(Knot tail, Set<Coordinate> tailVisited, Move move) {
            for (int i = 0; i < move.distance(); i++) {
                head.move(move.direction());
                head.adjustBelow();
                tailVisited.add(tail.position());
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Knot current = head;
            while (current != null) {
                sb.append(current.position).append(System.lineSeparator());
                current = current.below;
            }
            return sb.toString();
        }
    }

    private static class Knot {
        private Coordinate position;
        private final Knot below;

        public Knot(Coordinate position, Knot below) {
            this.position = position;
            this.below = below;
        }

        public Coordinate position() {
            return position;
        }

        private void move(Direction direction) {
            position = switch (direction) {
                case UP -> new Coordinate(position.x(), position.y() - 1);
                case DOWN -> new Coordinate(position.x(), position.y() + 1);
                case LEFT -> new Coordinate(position.x() - 1, position.y());
                case RIGHT -> new Coordinate(position.x() + 1, position.y());
            };
        }

        public void adjustBelow() {
            if (below == null) {
                // No knot -> nothing to adjust
                return;
            }

            int xDist = position.x() - below.position.x();
            int yDist = position.y() - below.position.y();

            if (Math.abs(xDist) <= 1 && Math.abs(yDist) <= 1) {
                // already close enough, no need to adjust anymore at all
                return;
            }

            if (xDist == 0) {
                // in same column
                adjustVertically(yDist);
            } else if (yDist == 0) {
                // in same row
                adjustHorizontally(xDist);
            } else {
                // needs to move diagonally
                adjustVertically(yDist);
                adjustHorizontally(xDist);
            }

            below.adjustBelow();
        }

        private void adjustHorizontally(int xDist) {
            if (xDist > 0) {
                below.move(Direction.RIGHT);
            } else {
                below.move(Direction.LEFT);
            }
        }

        private void adjustVertically(int yDist) {
            if (yDist > 0) {
                below.move(Direction.DOWN);
            } else {
                below.move(Direction.UP);
            }
        }

        @Override
        public String toString() {
            return "Knot{" +
                   "position=" + position +
                   ", below=" + below +
                   '}';
        }
    }

    private List<Move> parseInput(String input) {
        List<Move> moves = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            moves.add(new Move(scanner.nextLine()));
        }
        return moves;
    }

    private enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;

        public static Direction fromInput(String line) {
            return switch (line.substring(0, 1)) {
                case "U" -> UP;
                case "D" -> DOWN;
                case "L" -> LEFT;
                case "R" -> RIGHT;
                default -> throw new IllegalArgumentException("Unparseable direction");
            };
        }

        @Override
        public String toString() {
            return switch (this) {
                case UP -> "U";
                case DOWN -> "D";
                case LEFT -> "L";
                case RIGHT -> "R";
            };
        }
    }

    private record Move(Direction direction, int distance) {
        public Move(String line) {
            this(Direction.fromInput(line), Integer.parseInt(line.substring(2)));
        }

        @Override
        public String toString() {
            return direction.toString() + " " + distance;
        }
    }
}
