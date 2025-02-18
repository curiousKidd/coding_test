package codingTest.demo.codeUp.programmers.code_2023.cote_20230417;

import java.util.Stack;

public class cote01 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/12909
    // 정상 괄호 찾기

    /*
        String s    answer
        "()()"	    true
        "(())()"	true
        ")()("	    false
        "(()("	    false
     */

    public static void main(String[] args) {

        String s = "(())()";

        System.out.println("solution(s) = " + solution(s));
    }

    static boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = false;

        return answer;
    }
}
