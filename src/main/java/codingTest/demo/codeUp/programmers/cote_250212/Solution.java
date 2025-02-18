package codingTest.demo.codeUp.programmers.cote_250212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    // 모의고시
    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5};
        //        int[] answers = {1, 3, 2, 4, 2};

        Solution solution = new Solution();
        int[] solution1 = solution.solution(answers);

        System.out.println("solution1 = " + Arrays.toString(solution1));
    }

    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answer = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) answer[0]++;
            if (answers[i] == p2[i % p2.length]) answer[1]++;
            if (answers[i] == p3[i % p3.length]) answer[2]++;
        }

        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == answer[i]) list.add(i + 1);
        }

        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
