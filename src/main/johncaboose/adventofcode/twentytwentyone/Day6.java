package johncaboose.adventofcode.twentytwentyone;

import java.util.ArrayList;
import java.util.List;

public class Day6 implements ISolvableDay {


    @Override
    public long partOneSolver(String input) {
        long days = 80;
        List<Long> allFish = Utils.populateListWithCommaSeparatedLongs(input);
        return calculateFishPopulation(allFish, days);
    }

    @Override
    public long partTwoSolver(String input) {
        long days = 256;
        List<Long> allFish = Utils.populateListWithCommaSeparatedLongs(input);
        return calculateFishPopulation(allFish, days);
    }

    private static String listToString(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        for (long l : list) {
            sb.append(l);
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    private long calculateFishPopulation(List<Long> allFish, long days) {
        allFish = new ArrayList<>(allFish);

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            List<Long> newFish = new ArrayList<>();
            for (int i = 0; i < allFish.size(); i++) {
                long currentFishValue = allFish.get(i);
                if (currentFishValue == 0) {
                    newFish.add(8L);
                    allFish.set(i, 6L);
                } else {
                    allFish.set(i, currentFishValue - 1);
                }
            }
            allFish.addAll(newFish);
        }
        return allFish.size();
    }
}
