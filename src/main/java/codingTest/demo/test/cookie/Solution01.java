package codingTest.demo.test.cookie;

public class Solution01 {

    public static void main(String[] args) {

        int score = 319;

        System.out.println("solution(score) = " + solution(score));
    }

    public static int solution(int score) {
        int answer = 0;
        int score_copy = score;

        int[] jelly = {100, 50, 5, 1};

        for (int i = 0; i < jelly.length; i++) {
            answer += score_copy/jelly[i];
            score_copy = score_copy%jelly[i];
        }

        return answer;
    }

}
