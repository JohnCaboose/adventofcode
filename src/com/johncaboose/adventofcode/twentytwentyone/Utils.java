package com.johncaboose.adventofcode.twentytwentyone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static List<Integer> populateListWithNumbers(String input) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        return list;
    }

}
