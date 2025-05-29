package codingTest.demo.codeUp.programmers.cote_250526;

import java.util.HashMap;
import java.util.Map;

public class Solution250526 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    // 탐욕법 > 체육복

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println("solution(n, lost, reserve) = " + solution(n, lost, reserve));   // 5

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Map<Integer, Integer> map = new HashMap<>();

        //잃어버린
        for (int i = 0; i < lost.length; i++) {
            int lostNumber = lost[i];
            map.put(lostNumber, map.getOrDefault(lostNumber, 0) - 1);
        }

        //여유
        for (int i = 0; i < reserve.length; i++) {
            int reserveNumber = reserve[i];
            map.put(reserveNumber, map.getOrDefault(reserveNumber, 0) + 1);
        }

        //카운트
        // 이러면 바른 계산이 안되지
        for (Map.Entry<Integer, Integer> cnt : map.entrySet()) {
            if (cnt.getValue() < 0) {
                answer += cnt.getValue();
            }

        }

        return answer;
    }
}
