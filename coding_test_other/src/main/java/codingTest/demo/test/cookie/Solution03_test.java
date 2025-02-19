package codingTest.demo.test.cookie;

import java.util.HashMap;
import java.util.Map;

public class Solution03_test {

    public static int solution(String[] pouches) {
        Map<Character, Integer> jellyCounts = new HashMap<>();
        int totalJellyCount = 0;

        for (String pouch : pouches) {
            for (char jelly : pouch.toCharArray()) {
                jellyCounts.put(jelly, jellyCounts.getOrDefault(jelly, 0) + 1);
                totalJellyCount++;
            }
        }

        int maxCount = 0;
        for (int count : jellyCounts.values()) {
            maxCount = Math.max(maxCount, count);
        }

        if (maxCount > totalJellyCount / 2) {
            return 3;
        }

        for (int count : jellyCounts.values()) {
            if (count == totalJellyCount - count) {
                return 0;
            }
        }

        return 1;
    }

}
