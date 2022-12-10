package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;

class Day9 implements ISolvableDay<Long> {

    @Override
    public Long partOneSolver(String input) {
        List<Move> moves = parseInput(input);
        Set<Coordinate> tailVisited = new HashSet<>();
        Coordinate tail = new Coordinate(0, 4);
        Coordinate head = new Coordinate(0, 4);
        tailVisited.add(tail);
        for (Move move : moves) {
            for (int i = 0; i < move.distance(); i++) {
                Coordinate lastHead = head;
                head = move(head, move.direction());
                if (!nearEnough(head, tail)) {
                    tail = lastHead;
                    tailVisited.add(tail);
                }
            }
        }
        return (long) tailVisited.size();
    }

    @Override
    public Long partTwoSolver(String input) {
        return null;
    }

    private static Coordinate move(Coordinate coordinate, Direction direction) {
        return switch (direction) {
            case UP -> new Coordinate(coordinate.x(), coordinate.y() - 1);
            case DOWN -> new Coordinate(coordinate.x(), coordinate.y() + 1);
            case LEFT -> new Coordinate(coordinate.x() - 1, coordinate.y());
            case RIGHT -> new Coordinate(coordinate.x() + 1, coordinate.y());
        };
    }

    private static boolean nearEnough(Coordinate head, Coordinate tail) {
        return Math.abs(head.x() - tail.x()) <= 1 &&
               Math.abs(head.y() - tail.y()) <= 1;
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
