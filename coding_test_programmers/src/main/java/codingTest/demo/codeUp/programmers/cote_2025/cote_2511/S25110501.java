package codingTest.demo.codeUp.programmers.cote_2025.cote_2511;

import java.util.Arrays;

public class S25110501 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/161989

    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        System.out.println(Arrays.toString(solution(keymap, targets)));
    }


    /**
     * @param keymap  : 자판기 배열
     * @param targets : 만들어야하는 배열
     * @return
     */
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            String s = targets[i];
            int count = 0;

            for (char c : s.toCharArray()) {
                int idx = Integer.MAX_VALUE;
                boolean found = false;
                for (String key : keymap) {
                    int k = key.indexOf(c);
                    if (k == 0) {
                        found = true;
                        idx = 1;
                        break;
                    }
                    if (k >= 0) {
                        found = true;
                        idx = Math.min(idx, k + 1);
                    }
                }
                if (!found) {
                    return new int[]{-1};
                }
                count += idx;
            }

            answer[i] = count;
        }

        return answer;
    }
}

