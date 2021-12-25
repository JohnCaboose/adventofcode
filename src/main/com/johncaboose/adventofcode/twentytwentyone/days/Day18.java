package com.johncaboose.adventofcode.twentytwentyone.days;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Day18 implements ISolvableDay {

    public static final Pattern LITERAL_PATTERN = Pattern.compile("[0-9]");
    public static final Pattern LEFT_BRACKET_PATTERN = Pattern.compile("\\[");
    public static final Pattern COMMA_PATTERN = Pattern.compile(",");
    public static final Pattern RIGHT_BRACKET_PATTERN = Pattern.compile("]");

    @Override
    public long partOneSolver(String input) {
        Queue<SnailfishElement> inputNumbers = readInputNumbers(input);
        SnailfishElement result = inputNumbers.remove();
        while (inputNumbers.size() > 0) {
            SnailfishElement other = inputNumbers.remove();
            result.add(other);
            reduce(result);
        }
        long magnitude = result.getMagnitude();
        return magnitude;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }

    private Queue<SnailfishElement> readInputNumbers(String input) {
        Queue<SnailfishElement> readNumbers = new LinkedList<>();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                SnailfishElement currentNumber = readInputNumber(line);

                readNumbers.add(currentNumber);

            }
        }
        return readNumbers;
    }

    private SnailfishElement readInputNumber(String number) {
        try (Scanner scanner = new Scanner(number)) {
            return readSnailfishElement(scanner);
        }
    }

    private SnailfishElement readSnailfishElement(Scanner scanner) {

        String literalString = scanner.findWithinHorizon(LITERAL_PATTERN, 1);
        if (literalString != null) {
            int literal = Integer.parseInt(literalString);
            return new SnailfishLiteral(literal);
        }

        scanner.skip(LEFT_BRACKET_PATTERN);
        SnailfishElement leftSide = readSnailfishElement(scanner);

        scanner.skip(COMMA_PATTERN);
        SnailfishElement rightSide = readSnailfishElement(scanner);

        scanner.skip(RIGHT_BRACKET_PATTERN);

        SnailfishElement returnValue = new SnailfishNumber(leftSide, rightSide);
        return returnValue;

    }

    private static void reduce(SnailfishElement element) {
        while (true) {
            if (element.explode()) {
                continue;
            }

            if (element.split()) {
                break;
            }

        }
    }

    private static class SnailfishNumber extends AbstractSnailfishElement {
        private SnailfishElement leftSide;
        private SnailfishElement rightSide;


        public SnailfishNumber(SnailfishElement leftSide, SnailfishElement rightSide) {
            this.leftSide = leftSide;
            this.leftSide.setParent(this);
            this.leftSide.setSide(Side.LEFT);

            this.rightSide = rightSide;
            this.rightSide.setParent(this);
            this.rightSide.setSide(Side.RIGHT);
        }

        public SnailfishNumber(long leftSide, long rightSide) {
            this(new SnailfishLiteral(leftSide), new SnailfishLiteral(rightSide));
        }

        public void setLeft(SnailfishNumber replacementElement) {
            this.leftSide = replacementElement;
            replacementElement.setParent(this);
            replacementElement.setSide(Side.LEFT);
        }

        public void setRight(SnailfishNumber replacementElement) {
            this.rightSide = replacementElement;
            replacementElement.setParent(this);
            replacementElement.setSide(Side.RIGHT);
        }

        @Override
        public SnailfishElement add(SnailfishElement other) {
            SnailfishElement result = new SnailfishNumber(this, other);
            return result;
        }

        @Override
        public long getMagnitude() {
            return (3 * leftSide.getMagnitude()) + (2 * rightSide.getMagnitude());
        }

        @Override
        public Optional<SnailfishElement> getElementNestedInsideFourPairs(int parentNestLevel) {
            if (parentNestLevel == 3) {
                return Optional.of(this);
            } else {
                Optional<SnailfishElement> explodedLeft = leftSide.getElementNestedInsideFourPairs(parentNestLevel + 1);
                return explodedLeft.isPresent() ? explodedLeft : rightSide.getElementNestedInsideFourPairs(parentNestLevel + 1);
            }
        }

        @Override
        public Optional<SnailfishElement> getElementContainsRegularNumberTenOrGreater() {
            Optional<SnailfishElement> leftSideTenOrGreater = leftSide.getElementContainsRegularNumberTenOrGreater();
            return leftSideTenOrGreater.isPresent() ? leftSideTenOrGreater : rightSide.getElementContainsRegularNumberTenOrGreater();
        }

        @Override
        public boolean explode() {
            Optional<SnailfishElement> elementToExplode = getElementNestedInsideFourPairs(0);
            if (elementToExplode.isPresent()) {
                SnailfishElement parentOfExploder = elementToExplode.get().getParent();
                //TODO perform explosion

            }
            return elementToExplode.isPresent();
        }

        @Override
        public boolean split() {
            Optional<SnailfishElement> elementToSplit = getElementContainsRegularNumberTenOrGreater();
            if (elementToSplit.isPresent()) {
                SnailfishElement parentOfElementToSplit = elementToSplit.get().getParent();
                if (elementToSplit.get() instanceof SnailfishLiteral literalToSplit &&
                        parentOfElementToSplit instanceof SnailfishNumber parentOfSplitAsNumber) {

                    long roundedDownHalve = literalToSplit.literalValue / 2;
                    long roundedUpHalve = roundedDownHalve * 2 == literalToSplit.literalValue ? roundedDownHalve : roundedDownHalve + 1;
                    SnailfishNumber replacementElement = new SnailfishNumber(roundedDownHalve, roundedUpHalve);

                    switch (literalToSplit.getSide()) {
                        case LEFT:
                            replacementElement.setSide(Side.LEFT);
                            parentOfSplitAsNumber.setLeft(replacementElement);
                            break;
                        case RIGHT:
                            replacementElement.setSide(Side.RIGHT);
                            parentOfSplitAsNumber.setRight(replacementElement);
                            break;
                        default:
                            throw new UnsupportedOperationException("Cannot split root element");
                    }
                    return true;
                } else {
                    throw new UnsupportedOperationException("Only SnailfishLiteral can be split, and its parent must be a SnailfishNumber.");
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return "[" + leftSide + "," + rightSide + ']';
        }
    }

    private static class SnailfishLiteral extends AbstractSnailfishElement {
        private long literalValue;

        public SnailfishLiteral(long literalValue) {
            this.literalValue = literalValue;
        }

        @Override
        public SnailfishElement add(SnailfishElement other) {
            throw new UnsupportedOperationException();
        }

        @Override
        public long getMagnitude() {
            return literalValue;
        }

        @Override
        public Optional<SnailfishElement> getElementNestedInsideFourPairs(int parentNestLevel) {
            return Optional.empty();
        }

        @Override
        public Optional<SnailfishElement> getElementContainsRegularNumberTenOrGreater() {
            if (literalValue > 10) {
                return Optional.of(this);
            } else {
                return Optional.empty();
            }
        }


        @Override
        public boolean explode() {
            return false;
        }

        @Override
        public boolean split() {
            return false;
        }

        @Override
        public String toString() {
            return String.valueOf(literalValue);
        }

    }

    private enum Side {
        ROOT,
        LEFT,
        RIGHT;
    }

    private static abstract class AbstractSnailfishElement implements SnailfishElement {
        private SnailfishElement parent;
        private Side side = Side.ROOT;

        public SnailfishElement getParent() {
            return parent;
        }

        public void setParent(SnailfishElement parent) {
            this.parent = parent;
        }

        @Override
        public Side getSide() {
            return side;
        }

        @Override
        public void setSide(Side side) {
            this.side = side;
        }
    }

    private interface SnailfishElement {

        SnailfishElement getParent();

        void setParent(SnailfishElement parent);

        Side getSide();

        void setSide(Side side);

        SnailfishElement add(SnailfishElement other);

        long getMagnitude();

        Optional<SnailfishElement> getElementNestedInsideFourPairs(int parentNestLevel);

        Optional<SnailfishElement> getElementContainsRegularNumberTenOrGreater();

        boolean explode();

        boolean split();


    }


}
