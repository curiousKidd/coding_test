package codingTest.demo.codeUp.inflearn.section05_queue_stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution05 {

    //쇠막대기

    public int solution(String str) {
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') cnt += stack.size();
                else cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution05 T = new Solution05();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
