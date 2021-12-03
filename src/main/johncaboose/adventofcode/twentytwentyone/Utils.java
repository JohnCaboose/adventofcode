package johncaboose.adventofcode.twentytwentyone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static List<Long> populateListWithLongs(String input) {
        List<Long> list = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLong()) {
            list.add(scanner.nextLong());
        }
        return list;
    }


}
