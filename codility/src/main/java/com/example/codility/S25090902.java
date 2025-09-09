package com.example.codility;

import java.util.Arrays;

public class S25090902 {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

//        A = [1, 2, 3, 4]
//        K = 4

        System.out.println("solution() = " + Arrays.toString(solution(A, K)));
    }


    public static int[] solution(int[] A, int K) {
        int size = A.length;
        if (size == K) return A;

        int[] array = new int[size];
        int x = K;


        for (int i : Arrays.stream(A).toArray()) {
            array[x] = i;
            x++;

            if (x == size) {
                x = 0;
            }
        }

        return array;
    }

}
