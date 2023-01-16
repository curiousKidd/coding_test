package codingTest.demo.codeUp.programmers;

import java.util.Locale;

public class Solution06 {

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";

        Solution06 solution = new Solution06();

        String answer = solution.solution(new_id);

        System.out.println("answer = " + answer);
    }

    private String solution(String new_id) {
        String answer = "";

        answer = lowerCase(new_id);
        answer = conventRegex(answer);
        answer = fullStop(answer);

        return answer;
    }

    private String lowerCase(String id) {
        return id.toLowerCase(Locale.ROOT);
    }

    private String conventRegex(String id) {
        return id.replaceAll("![a-z1-9._-]", "");
    }

    private String fullStop(String id) {
        return id.replace("..", ".");
    }

}
