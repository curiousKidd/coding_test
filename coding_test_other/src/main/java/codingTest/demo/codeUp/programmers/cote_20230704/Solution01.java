package codingTest.demo.codeUp.programmers.cote_20230704;

public class Solution01 {

    public static void main(String[] args) {
        Solution01 solution = new Solution01();

        int n = 78;

        System.out.println("solution = " + solution.solution2(n));
    }

    public int solution(int n) {
        int answer = n + 1;

        int bit = Integer.bitCount(n);

        while (true) {
            int cnt = Integer.bitCount(answer);
            if (bit == cnt) break;
            answer++;
        }

        return answer;
    }

    public int solution2(int n) {
        int postPattern = n & -n;
        int smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;

        return n + postPattern | smallPattern;
    }
}
