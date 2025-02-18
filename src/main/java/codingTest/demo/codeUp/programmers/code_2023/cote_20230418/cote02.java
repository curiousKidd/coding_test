package codingTest.demo.codeUp.programmers.code_2023.cote_20230418;

import java.util.Arrays;

public class cote02 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/70129
    // 이진 변환 반복하기

    public static void main(String[] args) {
        String s = "110010101001";

        System.out.println("solution(s) = " + Arrays.toString(solution(s)));

    }

    public static int[] solution(String s) {

        int n = s.length() - s.replace("0", "").length();  // 0 제거 개수
        int replaceLength = s.replace("0", "").length();    // length

        int i = 1;

        while (replaceLength != 1) {
            i++;
            s = Integer.toBinaryString(replaceLength);
            n += s.length() - s.replace("0", "").length();  // 0 제거 개수
            replaceLength = s.replace("0", "").length();    // length
        }

        return new int[]{i, n};
    }

}
