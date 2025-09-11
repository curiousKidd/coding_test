package com.example.codility;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class S25091002 {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 5};

        System.out.println("solution() = " + solution(A));
    }


    public static int solution(int[] A) {
        int rangeSum = 0;
        for (int i = 1; i <= A.length + 1; i++) {
            System.out.println("i = " + i);
            rangeSum += i;
        }

        System.out.println("rangeSum = " + rangeSum);

        AtomicInteger arraySum = new AtomicInteger();
        Arrays.stream(A).forEach(arraySum::addAndGet);

        System.out.println("arraySum = " + arraySum.get());

        return rangeSum - arraySum.get();
    }

}
