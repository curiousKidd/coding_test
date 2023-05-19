package codingTest.demo.codeUp.programmers.cote_20230518;

import java.util.Arrays;

public class Cote02 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    // 탐욕법(Greedy) > 체육복

    public static void main(String[] args) {

        Cote02 cote02 = new Cote02();

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        System.out.println("cote02 = " + cote02.solution(n, lost, reserve));

    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }

        for (int i : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (i - 1 == reserve[j] || i + 1 == reserve[j]) {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
