package com.example.hackerRank;

public class S250922 {

    public static void main(String[] args) {
        System.out.println("solution() = " + solution(10));
    }

    public static int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        int length = 0;
        int max = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1' && length > 0) {
                max = Math.max(max, length);
                length = 0;
                continue;
            } else if (c == '1') {
                length = 0;
                continue;
            }
            length++;
        }

        return max;
    }
}
