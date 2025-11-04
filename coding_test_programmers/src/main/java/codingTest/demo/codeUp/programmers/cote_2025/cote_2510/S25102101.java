package codingTest.demo.codeUp.programmers.cote_2025.cote_2510;

import java.util.HashMap;
import java.util.Map;

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

        // name > index 맵핑
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(friends[i], i);
        }

        int[][] give = new int[n][n];   // 주고받은거
        int[] out = new int[n];         // 준거
        int[] in = new int[n];          // 받은거
        for (String gift : gifts) {
            String[] split = gift.split(" ");
            int i = map.get(split[0]);
            int j = map.get(split[1]);
            out[i]++;
            in[j]++;
            give[i][j]++;
        }

        int[] score = new int[n];
        for (int i = 0; i < n; i++) score[i] = out[i] - in[i];

        int[] next = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int ab = give[i][j];
                int ba = give[j][i];

                if (ab > ba) {
                    next[i]++;
                } else if (ab < ba) {
                    next[j]++;
                } else {
                    if (score[i] > score[j]) {
                        next[i]++;
                    } else if (score[j] > score[i]) {
                        next[j]++;
                    }
                }
            }
        }

        for (int x : next) {
            answer = Math.max(answer, x);
        }

        return answer;
    }

}

