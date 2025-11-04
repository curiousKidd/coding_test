package codingTest.demo.codeUp.programmers.cote_250526;

import java.util.*;

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
        // 1. Set으로 변환하여 '도난만 당한 학생'과 '여벌만 있는 학생' 분리
        Set<Integer> lostSet = new HashSet<>();
        for (int l : lost) {
            lostSet.add(l);
        }
        Set<Integer> reserveSet = new HashSet<>();
        for (int r : reserve) {
            reserveSet.add(r);
        }

        // 도난과 여벌이 겹치는 학생(=lost∩reserve)을 제거
        Set<Integer> intersection = new HashSet<>(lostSet);
        intersection.retainAll(reserveSet);
        for (int x : intersection) {
            lostSet.remove(x);
            reserveSet.remove(x);
        }

        // 2. 남은 lostSet, reserveSet을 정렬된 리스트로 변환
        List<Integer> lostList = new ArrayList<>(lostSet);
        List<Integer> reserveList = new ArrayList<>(reserveSet);
        Collections.sort(lostList);
        Collections.sort(reserveList);

        // 3. 그리디하게 인접 번호 학생에게 체육복 대여 시도
        int unableCount = 0;
        for (int l : lostList) {
            if (reserveList.contains(l - 1)) {
                // 왼쪽 이웃에게 빌림
                reserveList.remove(Integer.valueOf(l - 1));
            } else if (reserveList.contains(l + 1)) {
                // 오른쪽 이웃에게 빌림
                reserveList.remove(Integer.valueOf(l + 1));
            } else {
                // 빌릴 수 없으면 count 증가
                unableCount++;
            }
        }

        // 4. 체육수업에 참여 가능한 학생 수 = 전체 학생 수 - 빌리지 못한 학생 수
        return n - unableCount;
    }
}

