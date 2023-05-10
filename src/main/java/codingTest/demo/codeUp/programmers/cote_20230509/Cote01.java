package codingTest.demo.codeUp.programmers.cote_20230509;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Cote01 {

    //    https://school.programmers.co.kr/learn/courses/30/lessons/42587
    //    프로세스

    public static void main(String[] args) {

        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        Cote01 cote01 = new Cote01();

        System.out.println("cote01 = " + cote01.solution(priorities, location));

    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> integers = new LinkedList<>();

        int asInt = Arrays.stream(priorities).max().getAsInt();
        Arrays.stream(priorities).forEach(m -> integers.add(m));

        int out = 1;

        while (out == 1) {
            answer = integers.peek();

            if (answer == asInt) {
                System.out.println(integers);
                location -= 1;
                asInt -= asInt;
            } else {
                integers.add(answer);
            }

            if (location == 0) {
                out += 1;
            }

        }

        return answer;
    }

}
