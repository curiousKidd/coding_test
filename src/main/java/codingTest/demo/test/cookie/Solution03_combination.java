package codingTest.demo.test.cookie;

import java.util.ArrayList;
import java.util.List;

public class Solution03_combination {

    static int maxJellyCount;

    public static int solution(String[] pouches) {
        maxJellyCount = 0;
        List<String> selectedPouches = new ArrayList<>();
        int r = 1;  // 시작하는 조합의 크기

        while (r <= pouches.length) {
            test(pouches, selectedPouches, 0, r);
            r++;
        }

        return maxJellyCount;
    }

    private static void test(String[] pouches, List<String> jellyList, int start, int r) {
        if (jellyList.size() == r) {
            int[] jellyCounts = new int[5];
            int sum = 0;

            for (String pouch : jellyList) {
                for (int i = 0; i < pouch.length(); i++) {
                    char jellyType = pouch.charAt(i);
                    jellyCounts[jellyType - 'a']++;
                    sum++;
                }
            }

            int max = 0;
            for (int count : jellyCounts) {
                max = Math.max(max, count);
            }

            if (max > sum / 2) {
                maxJellyCount = Math.max(maxJellyCount, jellyList.size());
            }
            return;
        }

        for (int i = start; i < pouches.length; i++) {
            jellyList.add(pouches[i]);
            test(pouches, jellyList, i + 1, r);
            jellyList.remove(jellyList.size() - 1);
        }
    }
}
