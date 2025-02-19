package codingTest.demo.codeUp.programmers.code_before;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers {
    public void mbtiTest() {

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        char[] arrayText = {'T', 'E', 'S', 'T'};
        int[] arrayValue = {0, 0, 0, 0};

        int[] value = {3, 2, 1, 0, -1, -2, -3};

        for (int i = 0; i < choices.length; i++) {

            int choiceValue = value[choices[i] - 1];
            char[] chars = survey[i].toCharArray();

            switch (chars[0]) {
                case 'R':
                    arrayValue[0] = arrayValue[0] + choiceValue;
                    break;
                case 'C':
                    arrayValue[1] = arrayValue[1] + choiceValue;
                    break;
                case 'J':
                    arrayValue[2] = arrayValue[2] + choiceValue;
                    break;
                case 'A':
                    arrayValue[3] = arrayValue[3] + choiceValue;
                    break;

                case 'T':
                    arrayValue[0] = arrayValue[0] - choiceValue;
                    break;
                case 'F':
                    arrayValue[1] = arrayValue[1] - choiceValue;
                    break;
                case 'M':
                    arrayValue[2] = arrayValue[2] - choiceValue;
                    break;
                case 'N':
                    arrayValue[3] = arrayValue[3] - choiceValue;
                    break;
            }

        }

        arrayText[0] = arrayValue[0] >= 0 ? 'R' : 'T';
        arrayText[1] = arrayValue[1] >= 0 ? 'C' : 'F';
        arrayText[2] = arrayValue[2] >= 0 ? 'J' : 'M';
        arrayText[3] = arrayValue[3] >= 0 ? 'A' : 'N';

        String returnText = new String(arrayText);
        System.out.println("returnText = " + returnText);
    }

    public void hashMapDefaultValue() {
        int n = 5;
        String s = "ACBEDEASC";

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char x : chars) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }

    public void anagram() {
        String s1 = "ACBEDEASC";
        String s2 = "ACEASCBED";
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) System.out.println("NO");
            map.put(x, map.get(x) - 1);
        }

        System.out.println("YES");

    }

    public void absoluteValue() {
        String answer = "";

        String s = "-1 -2 -3 -4";
        String[] s1 = s.split(" ");
        int[] arrayInt = new int[s1.length];

        int i = 0;
        for (String text : s1) {
            arrayInt[i] = Integer.parseInt(text);
            i++;
        }

        Arrays.sort(arrayInt);
        System.out.println("i = " + Arrays.toString(arrayInt));

        answer = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];

        System.out.println("answer = " + answer);

    }

    public void overLapChar() {
        String str = "ksetserktt";
        for (int i = 0; i < str.length(); i++) {
            // TODO: 2022/09/24 str.indexOf(S) => 입력한값의 처음 위치를 return 
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(0)));
            // 만약 처음 나온 char 이라면 str.charAt(i) 값과 str.indexOf(str.charAt(0)) 값이 같다
        }
    }

    public void palindrome() { // 앞으로도 뒤로도 똑같은 단어 -> 회문
        String s = "GoOg";

        String answer = "YES";
        String upperS = s.toUpperCase();
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (upperS.charAt(i) != upperS.charAt(len - 1 - i)) answer = "NO";
        }

        System.out.println("answer = " + answer);
    }

}
