package codingTest.demo.test;

public class Solution01 {

    public static void main(String[] args) {

        Solution01 solution = new Solution01();

        String s = "1451232125";
        int N = 2;

        System.out.println("N = " + solution.solution(s, N));
    }

    public int solution(String s, int N) {
        int answer = -1;

        for (int i = 0; i <= s.length() - N; i++) {
            String substring = s.substring(i, i + N);
            int number = Integer.parseInt(substring);
            if (check(number, N)) {
                answer = Math.max(answer, number);
            }
        }

        return answer;
    }

    public static boolean check(int number, int N) {
        boolean[] booleans = new boolean[N + 1];

        while (number > 0) {
            int digit = number % 10;
            if (digit > N || booleans[digit]) {
                return false;
            }
            booleans[digit] = true;
            number /= 10;
        }

        for (int i = 1; i <= N; i++) {
            if (!booleans[i]) {
                return false;
            }
        }

        return true;
    }

}
