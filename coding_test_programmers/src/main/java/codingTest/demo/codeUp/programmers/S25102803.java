package codingTest.demo.codeUp.programmers;

import java.util.*;

public class S25102803 {

//    https://school.programmers.co.kr/learn/courses/30/lessons/178871

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));

    }


    /**
     * @param players  : 선수 이름 배열
     * @param callings : 해설진이 부른 이름 배열 : 해설진이 부른 이름은 등수 +1
     * @return
     */
    public static String[] solution(String[] players, String[] callings) {
        List<String> list = Arrays.asList(players);


        for (String calling : callings) {
            int i = list.indexOf(calling);
            if (i > 0) {
                Collections.swap(list, i, i - 1);
            }
        }

        return list.toArray(new String[0]);
    }

    /**
     * @param players  : 선수 이름 배열
     * @param callings : 해설진이 부른 이름 배열 : 해설진이 부른 이름은 등수 +1
     * @return
     */
    public static String[] solution2(String[] players, String[] callings) {
        // 이름 -> 현재 순위(인덱스)
        Map<String, Integer> pos = new HashMap<>(players.length * 2);
        for (int i = 0; i < players.length; i++) {
            pos.put(players[i], i);
        }

        for (String name : callings) {
            int i = pos.get(name);
            if (i == 0) continue; // 맨 앞이면 스킵

            // 앞사람과 자리 바꾸기 (배열 스왑)
            String front = players[i - 1];
            players[i - 1] = players[i];
            players[i] = front;

            // 두 사람의 인덱스 동기화 (O(1))
            pos.put(name, i - 1);
            pos.put(front, i);
        }

        // players 배열이 이미 제자리에서 변경됨
        return players;
    }

}

