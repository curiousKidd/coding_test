package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250807;

public class Solution250807 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/340212
    // 퍼즐 게임 챌린지

    public static void main(String[] args) {
        int[] diffs1 = {1, 5, 3}, times1 = {2, 4, 7};
        int[] diffs2 = {1, 4, 4, 2}, times2 = {6, 3, 8, 2};
        int[] diffs3 = {1, 328, 467, 209, 54}, times3 = {2, 7, 1, 4, 3};
        int[] diffs4 = {1, 99999, 100000, 99995}, times4 = {9999, 9001, 9999, 9001};


//        System.out.println("solution() = " + solution(diffs1, times1, 30)); // 3
//        System.out.println("solution() = " + solution(diffs2, times2, 59)); // 2
//        System.out.println("solution() = " + solution(diffs3, times3, 1723)); // 294
        System.out.println("solution() = " + solution(diffs4, times4, 3456789012L)); // 39354
    }

    public static int solution(int[] diffs, int[] times, long limit) {
        int level = 1;
        int prevTime = 0;
        int curTime = 0;
        for (int i = 0; i < diffs.length; i++) {
            // 사용되는 시간 계산
            if (diffs[i] <= level) {
                // 숙련도가 높을 경우, 현재 단계 시간 저장
                curTime += times[i];
            } else {
                // 숙련도가 낮을 경우, 앞 타임 포함하여, 반복 저장
                int diff = diffs[i] - level;
                curTime += (times[i] + prevTime) * diff;
            }

            // 이전 시간 저장
            prevTime = times[i];

            // 사용된 시간이 한계보다 클 경우
            if (curTime > limit) {
                level++;
                i = -1;
                curTime = 0;
                prevTime = 0;
            }
        }

        return level;
    }

}
