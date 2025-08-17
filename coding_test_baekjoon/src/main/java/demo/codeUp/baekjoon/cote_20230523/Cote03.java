package demo.codeUp.baekjoon.cote_20230523;

import java.util.Arrays;

public class Cote03 {

    // https://www.acmicpc.net/problem/2217
    // 그리디 알고리즘 > 로프

    public static void main(String[] args) {
        Cote03 cote03 = new Cote03();

        int n = 2;
        int[] w = {15, 10};

        System.out.println("cote03 = " + cote03.solution(n, w));
    }

    public int solution(int n, int[] w) {
        int answer = 0;

        Arrays.sort(w);

        for (int i = 0; i < n; i++) {
            int j = w[i] * (n - i);
            if (answer < j) {
                answer = j;
            }
        }

        return answer;
    }
}
