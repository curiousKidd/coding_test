package codingTest.demo.test.cookie;

import java.util.*;

public class Solution03 {

    public static void main(String[] args) {

        String[] pouches = {"d", "a", "e", "d", "abdcc"}; // 젤리 주머니 각각의 글자는 하나의 젤리를 나타냄

        System.out.println("so = " + solution(pouches));

    }


    public static int solution(String[] pouches) {
        int[] jellyCounts = new int[5];  // a, b, c, d, e

        for (String s : pouches) {
            for (int i = 0; i < s.length(); i++) {
                char jellyType = s.charAt(i);
                jellyCounts[jellyType - 'a']++;
            }
        }

        int max = 0;
        int sum = 0;

        for (int count : jellyCounts) {
            max = Math.max(max, count);
            sum += count;
        }

        if (max > sum / 2) {
            return 3;
        }

        for (int count : jellyCounts) {
            if (count == sum - count) {
                return 0;
            }
        }

        return 1;
    }

    public static int solution2(String[] pouches) {
        int[] jelly = new int[5];  // a, b, c, d, e
        int sum = 0;

        for (String s : pouches) {
            sum += s.length();
            for (int i = 0; i < s.length(); i++) {
                char jellyType = s.charAt(i);
                jelly[jellyType - 'a']++;
            }
        }

        Arrays.sort(jelly);

        if (jelly[4] == sum) {
            return 1;
        } else if (sum / 2 < jelly[4]) {
            return 3;
        }

        return 0;
    }
}
