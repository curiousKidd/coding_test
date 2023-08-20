package codingTest.demo.test;

public class Solution07 {
    public static void main(String[] args) {
        int[] schedules1 = {30, 30, 60, 90, 60, 15, 15, 60};
        System.out.println(solution(schedules1));  // 출력: 210

        int[] schedules2 = {45, 15, 30};
        System.out.println(solution(schedules2));  // 출력: 75
    }

    public static int solution(int[] schedules) {
        int n = schedules.length;
        int[] dp = new int[n];

        // Base cases
        dp[0] = schedules[0];
        dp[1] = Math.max(schedules[0], schedules[1]);

        // Dynamic programming
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + schedules[i]);
        }

        return dp[n - 1];
    }
}
