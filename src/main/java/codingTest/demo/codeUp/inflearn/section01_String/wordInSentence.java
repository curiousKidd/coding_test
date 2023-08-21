package codingTest.demo.codeUp.inflearn.section01_String;

import java.util.Scanner;

public class wordInSentence {

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
