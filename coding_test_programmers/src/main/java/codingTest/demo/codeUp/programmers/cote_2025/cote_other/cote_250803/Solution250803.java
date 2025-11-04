package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250803;

import java.util.Stack;

public class Solution250803 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42883
    // 탐욕법 > 큰 수 만들기

    public static void main(String[] args) {
        System.out.println("solution1(number, k) = " + solution("1924", 2)); // 94
        System.out.println("solution2(number, k) = " + solution("1231234", 3)); // 3234
        System.out.println("solution3(number, k) = " + solution("4122177252841", 4)); // 775841
        System.out.println("solution4(number, k) = " + solution("121234", 3)); // 234

    }

    public static String solution(String number, int k) {
        char[] chars = number.toCharArray();
        int n = chars.length;

        int targetLength = n - k;
        StringBuilder answer = new StringBuilder();

        int start = 0;
        for (int i = 0; i < targetLength; i++) {
            char max = '0';
            int maxIndex = start;

            // 선택 범위: [start, n - (targetLength - i)]
            int end = n - (targetLength - i) + 1;


            for (int j = start; j < end; j++) {
                if (chars[j] > max) {
                    max = chars[j];
                    maxIndex = j;
                    if (max == '9') break;  // 최댓값이면 더 볼 필요 없음
                }
            }

            answer.append(max);
            start = maxIndex + 1;  // 다음 검색 시작 위치
        }

        return answer.toString();
    }

    // 좋은 풀이
    public String solutionEx(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : number.toCharArray()) {
            // 현재 숫자가 스택 top보다 크면 pop
            while (!stack.isEmpty() && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // k가 남아 있는 경우 뒤에서 자르기
        while (k-- > 0) {
            stack.pop();
        }

        // 스택을 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }


}
