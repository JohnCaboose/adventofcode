package com.johncaboose.adventofcode.twentytwentyone.twentytwentyone;

import java.util.*;

public class Day10 implements ISolvableDay {

    private final Map<Character, Integer> scoreLookup = new HashMap<>();

    public Day10() {
        scoreLookup.put(')', 3);
        scoreLookup.put(']', 57);
        scoreLookup.put('}', 1197);
        scoreLookup.put('>', 25137);
    }

    @Override
    public long partOneSolver(String input) {
        long score = 0;
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                Deque<Character> closerStack = new ArrayDeque<>();
                String line = scanner.nextLine();
                for (Character currentChar : line.toCharArray()) {
                    final Character expectedNextCloser = closerStack.peek();


                    if (isOpener(currentChar)) {
                        switch (currentChar) {
                            case '(':
                                closerStack.push(')');
                                break;
                            case '[':
                                closerStack.push(']');
                                break;
                            case '{':
                                closerStack.push('}');
                                break;
                            case '<':
                                closerStack.push('>');
                                break;
                            default:
                                throw new RuntimeException("Faulty code or input");
                        }
                    } else if (currentChar.equals(expectedNextCloser)) {
                        //Found the right closer
                        closerStack.pop();
                    } else {
                        //Expected a closer but found the wrong closer
                        score = score + scoreLookup.get(currentChar);
                        break; //done with this line now
                    }


                }
            }

        }
        return score;
    }

    private boolean isOpener(Character currentChar) {
        switch (currentChar) {
            case '(':
            case '[':
            case '{':
            case '<':
                return true;
            default:
                return false;
        }

    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }


}
