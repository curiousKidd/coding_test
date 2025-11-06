package codingTest.demo.codeUp.programmers.cote_2025.cote_2511;

import java.util.HashMap;
import java.util.Map;

public class S25110601 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/159994

    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1, cards2, goal));
    }


    /**
     * @param cards1 : 단어 배열 1
     * @param cards2 : 단어 배열 2
     * @param goal   : 만들어야하는 문장
     * @return
     */
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> goalMap = new HashMap<>();

        for (int i = 0; i <= 10; i++) {
            if (i < cards1.length) map.put(cards1[i], map.getOrDefault(cards1[i], 0) + 1);
            if (i < cards2.length) map.put(cards2[i], map.getOrDefault(cards2[i], 0) + 1);
            if (i < goal.length) goalMap.put(goal[i], map.getOrDefault(goal[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> key : goalMap.entrySet()) {
            if (map.getOrDefault(key.getKey(), 0) == 0) return "No";
        }


        return answer;
    }
}


