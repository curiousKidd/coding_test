package codingTest.demo.codeUp.inflearn.section05_queue_stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution02 {

    /**
     * 올바른 괄호
     * <p>
     * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
     * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
     * <p>
     * ▣ 입력설명
     * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
     * <p>
     * ▣ 출력설명
     * 첫 번째 줄에 YES, NO를 출력한다.
     * <p>
     * ▣ 입력예제 1
     * (()(()))(()
     * <p>
     * ▣ 출력예제 1
     * NO
     */

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        Solution02 T = new Solution02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
