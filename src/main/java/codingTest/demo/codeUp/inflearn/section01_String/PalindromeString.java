package codingTest.demo.codeUp.inflearn.section01_String;

import java.util.Scanner;

public class PalindromeString {

    /**
     * 회문 문자열
     * <p>
     * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
     * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력
     * 하는 프로그램을 작성하세요.
     * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
     * <p>
     * IN
     * gooG
     * <p>
     * OUT
     * YES
     */

    public static void main(String[] args) {
        PalindromeString T = new PalindromeString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) answer = "NO";
        }
        return answer;
    }

    //    public String solution(String str){
    //        String answer="NO";
    //        String tmp=new StringBuilder(str).reverse().toString();
    //        if(str.equalsIgnoreCase(tmp)) answer="YES";
    //        return answer;
    //    }

}
