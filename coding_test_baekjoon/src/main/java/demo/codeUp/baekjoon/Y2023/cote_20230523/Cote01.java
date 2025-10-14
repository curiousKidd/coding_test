package demo.codeUp.baekjoon.cote_20230523;

import java.util.Arrays;

public class Cote01 {

    // https://www.acmicpc.net/problem/1026
    // 그리디 알고리즘 > 보물

    public static void main(String[] args) {
        Cote01 cote01 = new Cote01();

        int n = 5;
        int[] a = {1, 1, 1, 6, 0};
        int[] b = {2, 7, 8, 3, 1};

        System.out.println("cote01.solution(); = " + cote01.solution(n, a, b));
    }

    public int solution(int n, int[] a, int[] b) {
        int answer = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            answer += a[i] * b[n - 1 - i];
        }

        return answer;
    }
}
