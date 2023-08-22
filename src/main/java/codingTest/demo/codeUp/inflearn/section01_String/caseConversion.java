package codingTest.demo.codeUp.inflearn.section01_String;

import java.util.Scanner;

public class caseConversion {

    /**
     * 대소문자 변환
     * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로
     * 변환하여 출력하는 프로그램을 작성하세요.
     * <p>
     * IN
     * StuDY
     * <p>
     * OUT
     * sTUdy
     */

    public static void main(String[] args) {
        caseConversion T = new caseConversion();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution1(str));
        System.out.print(T.solution2(str));
    }

    public String solution1(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);

        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) answer += (char) (x - 32);
            else answer += (char) (x + 32);
        }
        return answer;
    }

}
