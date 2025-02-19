package codingTest.demo.codeUp.programmers.cote_20230703;

import java.util.Arrays;
import java.util.Comparator;

public class Solution01 {

    public static void main(String[] args) {

        Solution01 solution01 = new Solution01();

        int[][] target = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};

        System.out.println("solution01 = " + solution01.solution(target));

    }

    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, Comparator.comparing(t -> t[1]));

        int start = 0;
        int end = 0;
        int targetEnd = 0;

        for (int[] target : targets) {
            start = target[0];
            end = target[1];

            if (start >= targetEnd) {
                targetEnd = end;
                answer++;
            }

        }

        return answer;
    }

}
