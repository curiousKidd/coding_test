package com.example.codility;

import java.util.HashSet;
import java.util.Set;

public class S25091006 {
    public static void main(String[] args) {
        String s = "15:15:00", t = "15:15:12";

        System.out.println("solution() = " + solution(s, t));
    }


    public static int solution(String S, String T) {
        int count = 0;

        int start = convertSecond(S);
        int end = convertSecond(T);
        if (end < start) end += 24 * 3600;

        for (int i = start; i <= end; i++) {
            String nowTimeText = convertFormat(i);
            System.out.println("nowTimeText = " + nowTimeText);

            Set<Character> set = new HashSet<>();
            for (char c : nowTimeText.toCharArray()) set.add(c);
            System.out.println("set = " + set.size());

            if (set.size() <= 2) count++;
        }

        return count;
    }

    private static int convertSecond(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        int minute = Integer.parseInt(split[1]);
        int second = Integer.parseInt(split[2]);

        return hour * 3600 + minute * 60 + second;
    }

    private static String convertFormat(int second) {
        int hour = second / 3600;
        int min = second % 3600 / 60;
        int sec = second % 60;

        return String.format("%02d%02d%02d", hour, min, sec);
    }

}
