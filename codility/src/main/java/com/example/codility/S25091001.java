package com.example.codility;

public class S25091001 {
    public static void main(String[] args) {
        int X = 10, Y = 85, D = 30;

        System.out.println("solution() = " + solution(X, Y, D));
    }


    public static int solution(int X, int Y, int D) {
        int minus = Y - X;
        int result = 0;

        result = minus % D != 0 ? (minus / D) + 1 : minus / D;

        return result;
    }

}
