package codingTest.demo.codeUp.programmers.cote_20250213;

public class Solution20250213 {

    public static void main(String[] args) {
        Solution20250213 solution20250213 = new Solution20250213();

        String numbers = "17";
        //        String numbers = "011";
        solution20250213.solution(numbers);
    }

    public int solution(String numbers) {
        int answer = 0;
        int[] num = new int[numbers.length()];
        for (String s : numbers.split("")) {
            num[s.charAt(0) - '0']++;
        }

        return answer;
    }
}
