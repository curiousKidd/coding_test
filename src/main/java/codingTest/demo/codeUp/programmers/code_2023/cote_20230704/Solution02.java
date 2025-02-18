package codingTest.demo.codeUp.programmers.code_2023.cote_20230704;

public class Solution02 {

    public static void main(String[] args) {
        Solution02 solution = new Solution02();

        int n = 100000;

        System.out.println("solution = " + solution.solution(n));
    }

    public int solution(int n) {
        int[] cal = new int[n + 1];

        cal[0] = 0;
        cal[1] = 1;

        int mod = 1234567;

        for (int i = 2; i <= n; i++) {
            cal[i] = (cal[i - 2] % mod) + (cal[i - 1] % mod);
            System.out.println("i = " + cal[i]);
        }

        return cal[n] % mod;
    }

}
