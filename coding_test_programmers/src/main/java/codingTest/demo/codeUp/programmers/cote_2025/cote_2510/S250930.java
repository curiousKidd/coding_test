package codingTest.demo.codeUp.programmers;

import java.util.Arrays;

public class S250930 {

    public static void main(String[] args) {
        int[][] info = {{1, 2}, {2, 3}, {2, 1}};
        int n = 4;
        int m = 4;

        System.out.println("solution(info, n, m) = " + solution(info, n, m));
    }

    public static int solution(int[][] info, int n, int m) {
        // b 합 구한뒤
        int sumB = 0;
        for (int[] it : info) sumB += it[1];
        if (sumB < m) return 0;

        final int INF = 1_000_000_000;
        // dp[c] = B 흔적이 c일 때 가능한 A 최소 흔적
        int[] dp = new int[m]; // B가 m-1까지만 유효
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int[] it : info) {
            int a = it[0], b = it[1];
            int[] next = new int[m];
            Arrays.fill(next, INF);

            // A가 훔치는 경우: B 흔적 변화 없음, A 흔적 a 추가
            for (int c = 0; c < m; c++) {
                if (dp[c] == INF) continue;
                // A 선택
                if (dp[c] + a < next[c]) next[c] = dp[c] + a;
                // B 선택: B 흔적 c+b가 m 미만이어야 유효
                int nc = c + b;
                if (nc < m && dp[c] < next[nc]) next[nc] = dp[c];
            }
            dp = next;
        }

        int ans = INF;
        for (int c = 0; c < m; c++) {
            if (dp[c] < ans) ans = dp[c];
        }
        // A 흔적이 n 이상이면 잡히므로 실패 처리
        return (ans < n) ? ans : -1;
    }
}
