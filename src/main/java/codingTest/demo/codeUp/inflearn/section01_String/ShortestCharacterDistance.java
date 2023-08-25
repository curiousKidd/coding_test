package codingTest.demo.codeUp.inflearn.section01_String;

import java.util.Scanner;

public class ShortestCharacterDistance {

    /**
     * 가장 짧은 문자거리
     * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출
     * 력하는 프로그램을 작성하세요.
     * <p>
     * ▣ 입력설명
     * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
     * 문자열의 길이는 100을 넘지 않는다.
     * <p>
     * ▣ 출력설명
     * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
     * <p>
     * ▣ 입력예제 1
     * teachermode e
     * <p>
     * ▣ 출력예제 1
     * 1 0 1 2 1 0 1 2 2 1 0
     */

    public static void main(String[] args) {
        ShortestCharacterDistance T = new ShortestCharacterDistance();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

}
