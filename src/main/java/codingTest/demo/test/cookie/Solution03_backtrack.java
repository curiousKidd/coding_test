package codingTest.demo.test.cookie;

import java.util.ArrayList;
import java.util.List;

public class Solution03_backtrack {

    static int maxJellyCount;

    public static int solution(String[] pouches) {
        maxJellyCount = 0;
        backtrack(pouches, new ArrayList<>(), 0);
        return maxJellyCount;
    }

    private static void backtrack(String[] pouches, List<String> selectedPouches, int index) {
        if (index == pouches.length) {
            int[] jellyCounts = new int[5];
            int totalJellyCount = 0;

            for (String pouch : selectedPouches) {
                for (int i = 0; i < pouch.length(); i++) {
                    char jellyType = pouch.charAt(i);
                    jellyCounts[jellyType - 'a']++;
                    totalJellyCount++;
                }
            }

            int maxCount = 0;
            for (int count : jellyCounts) {
                maxCount = Math.max(maxCount, count);
            }

            if (maxCount > totalJellyCount / 2) {
                maxJellyCount = Math.max(maxJellyCount, selectedPouches.size());
            }
            return;
        }

        // Include the current pouch
        selectedPouches.add(pouches[index]);
        backtrack(pouches, selectedPouches, index + 1);
        selectedPouches.remove(selectedPouches.size() - 1);

        // Exclude the current pouch
        backtrack(pouches, selectedPouches, index + 1);
    }


}
