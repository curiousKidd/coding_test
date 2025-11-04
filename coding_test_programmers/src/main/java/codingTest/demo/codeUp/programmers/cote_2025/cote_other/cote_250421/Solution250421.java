package codingTest.demo.codeUp.programmers.cote_250421;

import java.util.HashMap;
import java.util.Map;

public class Solution250421 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/42576
    //완주하지 못한 선수

    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        // "leo"

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        // "vinko"

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        // "mislav"

        //        System.out.println(solution(participant1, completion1));
        //        System.out.println(solution(participant2, completion2));
        System.out.println(solution(participant3, completion3));
    }

    //    public static String solution(String[] participant, String[] completion) {
    //        StringBuilder answer = new StringBuilder();
    //
    //        int counter = 0;
    //
    //        for (String name : participant) {
    //            for (int i = 0; i < completion.length; i++) {
    //                if (name.equals(completion[i])) {
    //                    completion[i] = Strings.EMPTY;
    //                    counter = 0;
    //                    break;
    //                }
    //
    //                counter++;
    //            }
    //            if (counter == completion.length) answer.append(name);
    //        }
    //
    //        return answer.toString();
    //    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String p : participant) {
            countMap.put(p, countMap.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            countMap.put(c, countMap.get(c) - 1);
        }

        /// entrySet >  k v map를 반환하네
        /// hashMap는 어떻게 중복을 허용하지 않을까?
        /// hashCode()를 통해서 서로 같은 입력값인지를 비교한다고 하네
        /// 이건 hash 함수랑 같은 개념이려나
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        return ""; // 문제 조건상 절대 도달하지 않음
    }

}
