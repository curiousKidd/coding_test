package codingTest.demo.codeUp.programmers.code_2023.cote_20230418;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class cote01 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/12941
    // 최솟값 만들기

    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        System.out.println("solution(A,B) = " + solution(A, B));

    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        int n = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n - 1 - i];
        }

        return answer;
    }

}
