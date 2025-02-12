package codingTest.demo.codeUp.programmers.cote_20250212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    // 모의고시
    public static void main(String[] args) {

        //        int[] answers = {1,2,3,4,5};
        int[] answers = {1, 3, 2, 4, 2};

        Solution solution = new Solution();
        int[] solution1 = solution.solution(answers);

        System.out.println("solution1 = " + Arrays.toString(solution1));
    }

    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int answer1 = 0, answer2 = 0, answer3 = 0;

        for (int i = 0; i < answers.length; i++) {
            answer1 += answers[i] == p1[i % p1.length] ? 1 : 0;
            answer2 += answers[i] == p2[i % p2.length] ? 1 : 0;
            answer3 += answers[i] == p3[i % p3.length] ? 1 : 0;
        }

        List<Integer> list = new ArrayList<>();
        if (answer1 != 0) list.add(answer1);
        if (answer2 != 0) list.add(answer2);
        if (answer3 != 0) list.add(answer3);

        System.out.println("list = " + list.toString());

        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
