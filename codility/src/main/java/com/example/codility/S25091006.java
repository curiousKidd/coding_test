package com.example.codility;

public class S25091004 {
    public static void main(String[] args) {
        int[] A = {3, 1, 5, 3, 4, 2}; // result 3

        System.out.println("solution() = " + solution(A));
    }


    public static int solution(int[] A) {
        int n = A.length;
        if (n < 2) return 0;

        long[] sum = new long[3];
        sum[0] = (long) A[0] + A[1];
        sum[1] = (long) A[0] + A[n - 1];
        sum[2] = (long) A[n - 1] + A[n - 2];

        int answer = 0;
        for (long l : sum) {
            answer = Math.max(answer, (int) l);

        }


        return answer;
    }

}
