package codingTest.demo.codeUp.inflearn.section01_String;

import java.util.Scanner;

public class wordInSentence {

    /**
     * 문장 속 단어
     * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로
     * 변환하여 출력하는 프로그램을 작성하세요.
     * <p>
     * IN
     * it is time to study
     * <p>
     * OUT
     * study
     */

    public static void main(String[] args) {
        wordInSentence T = new wordInSentence();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

}
