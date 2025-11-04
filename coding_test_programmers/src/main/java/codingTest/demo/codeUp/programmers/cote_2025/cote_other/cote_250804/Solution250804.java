package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250804;

import java.util.Arrays;

public class Solution250804 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/86491
    // 최소직사각형

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println("solution(sizes) = " + solution(sizes));
    }

    public static int solution(int[][] sizes) {

        return Arrays
                .stream(sizes)
                // 배열 안의 요소들을 하나씩 누적해서 최종 결과 하나를 만드는 함수
                // a는 지금까지의 누적 최대값, b 는 새로운 비교대상 값
                .reduce((a, b) -> new int[]{
                        //저장되어있는 값(a)과, 현재 값(b)을 비교하여, 긴 변의 가장 큰 값을 비교하고
                        Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])),
                        //저장되어있는 값(a)과, 현재 값(b)을 비교하여, 짧은 변의 가장 큰 값을 비교합니다.
                        Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
                }).map(it -> it[0] * it[1])
                .get();
    }

}
