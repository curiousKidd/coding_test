package codingTest.demo.codeUp.programmers.cote_20230823;

import java.util.Arrays;
import java.util.Objects;

public class CharactersThatAppearOnlyOnce {

    //https://school.programmers.co.kr/learn/courses/30/lessons/120896?language=java
    //한 번만 등장한 문자

    public static void main(String[] args) {

        String s = "abdc";

        System.out.println("solution() = " + solution(s));

    }

    public static String solution(String s) {
        String[] chars = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                chars[i] = String.valueOf(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();

        Arrays.stream(chars)
                .filter(Objects::nonNull)
                .sorted()
                .forEach(sb::append);

        return sb.toString();
    }
}
