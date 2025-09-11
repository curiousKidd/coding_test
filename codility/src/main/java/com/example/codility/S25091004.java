package com.example.codility;

public class S25091003 {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};

        System.out.println("solution() = " + solution(A));
    }


    public static int solution(int[] A) {
        long total = 0;
        for (int x : A) total += x;

        long left = 0;
        long answer = Long.MAX_VALUE;

        
        for (int i = 0; i < A.length - 1; i++) {
            left += A[i];
            long diff = Math.abs(total - 2 * left);
            if (diff < answer) answer = diff;
        }
        return (int) answer;
    }

}
