package codingTest.demo.codeUp.programmers.code_2023.cote_20230430;

import java.util.Stack;

public class cote01 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/12906
    // 같은 숫자는 싫어

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        System.out.println("solution(A,B) = " + solution(arr));

    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

}
