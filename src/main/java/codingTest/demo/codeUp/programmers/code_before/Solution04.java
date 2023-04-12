package codingTest.demo.codeUp.programmers.code_before;

import java.util.Arrays;

public class Solution04 {
    public void solution() {

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] answer = new int[N + 1];

        int[] stageTotal = new int[N + 1];  // 스테이지 별 총합
        int[] clearCount = new int[N + 1]; // 스테이지 클리어 수
        float[] failureRate = new float[N + 1]; // 실패율

        // stage별 user 수
        for (int stage : stages) {
            stageTotal[stage - 1]++;
        }
        int t = 0;
        for (int i = N; i >= 0; i--) {
            t += stageTotal[i];
            clearCount[i] = t;
            failureRate[i] = stageTotal[i] / (float) t;
        }

        System.out.println("t = " + t);
        System.out.println("stageTotal = " + Arrays.toString(stageTotal));
        System.out.println("clearCount = " + Arrays.toString(clearCount));
        System.out.println("failureRate = " + Arrays.toString(failureRate));
        //        Arrays.sort(failureRate);
        System.out.println("failureRate = " + Arrays.toString(failureRate));

    }
}
