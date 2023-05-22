package codingTest.demo.codeUp.baekjoon.cote_20230522;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://www.acmicpc.net/problem/1931
// 백준 -> 그리디 알고리즘 -> 잃어버린 괄호

class Time implements Comparable<Time> {

    int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if (this.e == o.e) return this.s - o.s;
        return this.e - o.e;
    }
}

public class Cote01 {

    public static void main(String[] args) {
        Cote01 cote01 = new Cote01();

        ArrayList<Time> times = (ArrayList<Time>) cote01.addTime();

        System.out.println("cote01 = " + cote01.solution(11, times));

    }

    public int solution(int cnt, List<Time> times) {
        int answer = 0;

        Collections.sort(times);

        int endTime = 0;

        for (Time time : times) {
            if (endTime <= time.s) {
                answer++;
                endTime = time.e;
            }
        }

        return answer;
    }

    public ArrayList<Time> addTime() {
        ArrayList<Time> times = new ArrayList<>();

        times.add(new Time(1, 4));
        times.add(new Time(3, 5));
        times.add(new Time(0, 6));
        times.add(new Time(5, 7));
        times.add(new Time(3, 8));
        times.add(new Time(5, 9));
        times.add(new Time(6, 10));
        times.add(new Time(8, 11));
        times.add(new Time(8, 12));
        times.add(new Time(2, 13));
        times.add(new Time(12, 14));

        return times;
    }
}
