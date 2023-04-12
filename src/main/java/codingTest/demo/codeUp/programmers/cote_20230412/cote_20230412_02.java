package codingTest.demo.codeUp.programmers.cote_20230412;

import java.util.Arrays;
import java.util.stream.Collectors;

public class cote_20230412_02 {

    public static void main(String[] args) {
        String s = "3people unFollowed    me ";

        cote_20230412_02 cote = new cote_20230412_02();

        System.out.println("value = /" + cote.solution(s) + "/");
    }

    public String solution(String s) {
        s += "G";
        String[] arr = s.split(" ");

        String answer = "";

        //        String[] texts = s.split(" ");
        //        for (int i = 0; i < texts.length; i++) {
        //            System.out.println("texts[i] = " + texts[i]);
        //            texts[i] = splitText(texts[i]);
        //        }
        //
        //        return String.join(" ", texts);

        return Arrays.stream(arr)
                .limit(arr.length)
                .map(e -> {
                    if (e.equals("")) {
                        return "";
                    } else {
                        return String.valueOf(e.charAt(0)).toUpperCase() + e.substring(1).toLowerCase();
                    }
                })
                .collect(Collectors.joining(" "));
    }

    private String splitText(String x) {
        char[] chars = x.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int j = 1; j < chars.length; j++) {
            chars[j] = Character.toLowerCase(chars[j]);
        }

        return new String(chars);
    }

}
