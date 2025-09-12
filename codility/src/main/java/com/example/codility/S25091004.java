package com.example.codility;

public class S25091004 {
    public static void main(String[] args) {
//        int[] A = {3, 1, 5, 3, 4, 2}; // result 3
//        int[] A = {4, 1, 4, 3, 3, 2, 5, 2}; // result 4
//        int[] A = {1, 9, 1, 1, 1, 1, 1, 8, 1}; // result 1
        int[] A = {1, 1, 2, 3, 1, 2, 2, 1, 1, 2, 1, 1, 2, 3, 1, 2, 2, 1, 1, 2, 1, 1, 2, 3, 1, 2, 2, 1, 1, 2, 1, 1, 2, 3, 1, 2, 2, 1, 1, 2, 1, 1, 2, 3, 1, 2, 2, 1, 1, 2}; // result 4

        System.out.println("solution() = " + solution(A));
    }


    public static int solution(int[] A) {
        int n = A.length;
        if (n < 2) return 0;

        long[] sum = new long[3];
        sum[0] = (long) A[0] + A[1];
        sum[1] = (long) A[0] + A[n - 1];
        sum[2] = (long) A[n - 1] + A[n - 2];

        return Math.max(
                Math.max(dfs(A, sum[0], 0, n - 1), dfs(A, sum[1], 0, n - 1)),
                dfs(A, sum[2], 0, n - 1));
    }

    private static int dfs(int[] A, long S, int l, int r) {
        if (r - l + 1 < 2) return 0;

        int best = 0;

        if (l + 1 <= r && A[l] + A[l + 1] == S) {
            best = Math.max(best, 1 + dfs(A, S, l + 2, r));
            System.out.println("best11111111 = " + best);
        }

        if (A[l] + A[r] == S) {
            best = Math.max(best, 1 + dfs(A, S, l + 1, r - 1));
            System.out.println("best222222222 = " + best);
        }

        if (l <= r - 1 && A[r] + A[r - 1] == S) {
            best = Math.max(best, 1 + dfs(A, S, l, r - 2));
            System.out.println("best333333333 = " + best);
        }

        return best;
    }

}
