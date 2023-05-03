package codingTest.demo.codeUp.programmers.cote_20230501;

import java.util.Arrays;

public class cote01 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42586
    // 기능 개발

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println("solution(A,B) = " + solution(progresses, speeds));  


    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] complateDay = new int[100];

        int day = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            complateDay[day]++;
        }

        return Arrays.stream(complateDay).filter(i -> i != 0).toArray();
    }

    /**
     * int n = progresses.length;
     *         int[] days = new int[n]; // 각 작업이 완료되기까지 걸리는 일 수 저장
     *         for (int i = 0; i < n; i++) {
     *             int remain = 100 - progresses[i];
     *             days[i] = remain % speeds[i] == 0 ? remain / speeds[i] : remain / speeds[i] + 1;
     *         }
     *
     *         List<Integer> answerList = new ArrayList<>();
     *         int i = 0;
     *         while (i < n) {
     *             int cnt = 1;
     *             int maxDays = days[i];
     *             for (int j = i + 1; j < n; j++) {
     *                 if (days[j] > maxDays) break;
     *                 cnt++;
     *             }
     *             answerList.add(cnt);
     *             i += cnt;
     *         }
     *
     *         int[] answer = new int[answerList.size()];
     *         for (int j = 0; j < answerList.size(); j++) {
     *             answer[j] = answerList.get(j);
     *         }
     *         return answer;
     */

}
