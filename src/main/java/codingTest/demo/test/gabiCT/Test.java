package codingTest.demo.test.gabiCT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String s = "centerminus";
        String[] word_dict = {"cent", "center", "term", "terminus", "rm", "min", "minus", "us"};

        List<String> wordList = Arrays.asList(word_dict);
        List<String> results = new ArrayList<>();

        findLongestWord(s, wordList, results, "");

        String longestWord = "";
        for (String result : results) {
            if (result.length() > longestWord.length()) {
                longestWord = result;
            }
        }

        System.out.println("가장 긴 끝말잇기 단어: " + longestWord);
    }

    public static void findLongestWord(String s, List<String> wordList, List<String> results, String current) {
        if (s.length() == 0) {
            results.add(current);
            return;
        }

        for (String word : wordList) {
            if (s.startsWith(word)) {
                String remaining = s.substring(word.length());
                String newCurrent = current.isEmpty() ? word : current + " + " + word;
                findLongestWord(remaining, wordList, results, newCurrent);
            }
        }
    }

}
