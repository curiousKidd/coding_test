package codingTest.demo.codeUp.inflearn.section01_String;

import java.util.Scanner;

public class ExtractOnlyNumbers {

    /**
     * 숫자만 추출
     * <p>
     * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만
     * 듭니다.
     * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205
     * 이 됩니다.
     * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
     * <p>
     * ▣ 입력예제 1
     * g0en2T0s8eSoft
     * ▣ 출력예제 1
     * 208
     */

    public static void main(String[] args) {
        ExtractOnlyNumbers T = new ExtractOnlyNumbers();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }

    public int solution(String s) {
        //int answer=0;
        String answer = "";
        for (char x : s.toCharArray()) {
            //if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

}
