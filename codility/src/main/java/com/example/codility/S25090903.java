package com.example.codility;

public class S25090903 {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};

        System.out.println("solution() = " + solution(A));
    }


    public static int solution(int[] A) {
        // Implement your solution here
        int x = 0;

        for (int v : A) {
            // XOR 비트 연산자의 경우
            // 같은 값이면 0, 다른값이면 1을 반환한다.
            x ^= v;
            System.out.println("x = " + x);
        }

        return x;
    }

}
