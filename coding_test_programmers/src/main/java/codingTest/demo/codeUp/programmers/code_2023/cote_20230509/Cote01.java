package codingTest.demo.codeUp.programmers.code_2023.cote_20230509;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Cote01 {

    //    https://school.programmers.co.kr/learn/courses/30/lessons/42587
    //    프로세스

    public static void main(String[] args) {

        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        Cote01 cote01 = new Cote01();

        System.out.println("cote01 = " + cote01.solution(priorities, location));

    }

    public int solution(int[] priorities, int location) {
        int answer = 1;

        Queue<Integer> integers = new LinkedList<>();
        Queue<Integer> point = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            integers.add(priorities[i]);
            point.add(i);
        }

        int max = Collections.max(integers);

        while (!integers.isEmpty()) {
            int a = integers.poll();
            int lk = point.poll();
            if (a == max && lk == location) {
                return answer;
            } else if (a == max) {
                answer += 1;
                max = Collections.max(integers);
            } else {
                integers.add(a);
                point.add(lk);
            }
        }
        return answer;
    }

}
