package codingTest.demo.codeUp.programmers;

import java.util.HashMap;

public class S25102101 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/388351

    public static void main(String[] args) {
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        System.out.println(solution(friends, gifts));
    }

    /**
     * @param friends : 친구 목록
     * @param gifts   : 주고받은 선물 기록
     * @return
     */
    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int n = friends.length;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(friends[i], i);
        }

        // "A B" = A > B 에게 선물을 줌
        int[][] give = new int[n][n];
        int[] in = new int[n];
        int[] out = new int[n];

        for (String gift : gifts) {
            String[] split = gift.split(" ");
            int a = map.get(split[0]);
            int b = map.get(split[1]);

            give[a][b]++;
            out[a]++;
            in[b]++;
        }

        int[] score = new int[n];
        for (int i = 0; i < n; i++) score[i] = out[i] - in[i];

        // 4) 다음 달에 받을 개수 예측
        int[] next = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int ab = give[i][j];
                int ba = give[j][i];

                if (ab > ba) {
                    // i가 j에게 더 많이 줬음 -> i가 1개 받음
                    next[i]++;
                } else if (ab < ba) {
                    // j가 i에게 더 많이 줬음 -> j가 1개 받음
                    next[j]++;
                } else {
                    // 기록이 없거나 동일 -> 선물지수 비교
                    if (score[i] > score[j]) next[i]++;
                    else if (score[i] < score[j]) next[j]++;
                    // 같으면 아무도 받지 않음
                }
            }
        }

        // 5) 최댓값
        for (int x : next) answer = Math.max(answer, x);
        return answer;
    }

}

