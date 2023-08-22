package codingTest.demo.codeUp.inflearn.section01_String;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

    /**
     * 중복문자제거
     * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
     * 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     * <p>
     * IN
     * ksekkset
     * <p>
     * OUT
     * kset
     */

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveDuplicateCharacters T = new RemoveDuplicateCharacters();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }

}
