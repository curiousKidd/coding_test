package codingTest.demo.codeUp.programmers.code_2023.cote_20230904;

public class LongJump {

    // https://school.programmers.co.kr/learn/courses/30/lessons/12914

    public static void main(String[] args) {
        int n = 3;

        System.out.println("so'' = " + solution(n));
    }

    public static long solution(int n) {
        long answer = 1;

        int jum1 = n;
        int jum2 = 0;

        while (jum1 > 0) {
            jum1 -= 2;
            jum2++;

            answer += jum1 + 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];

        //        return answer % 1234567;
    }

}
