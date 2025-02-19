package codingTest.demo.codeUp.programmers.code_before;

import java.util.HashMap;
import java.util.Map;

//숫자 문자열과 영단어
public class Solution05 {
    public void solution() {
        String s = "one4seveneight";
        int answer = 0;

        String[] texts = s.split("");
        String returnValue = "";
        String engNumber = "";

        //        String[] number = {
        //                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        //        };

        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);

        for (String text : texts) {
            if (text.matches("[0-9]")) {
                returnValue += text;
            } else {

                engNumber += text;
                if (engNumber.length() >= 3) {
                    Integer i = numbers.get(engNumber);
                    if (i != null) {
                        engNumber = "";
                        returnValue += i;
                    }
                }
            }

        }

        answer = Integer.parseInt(returnValue);

        System.out.println(answer);
    }
}
