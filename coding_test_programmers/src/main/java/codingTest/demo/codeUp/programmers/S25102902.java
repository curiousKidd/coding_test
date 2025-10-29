package codingTest.demo.codeUp.programmers;

import java.util.Arrays;
import java.util.HashMap;

public class S25102901 {

//    https://school.programmers.co.kr/learn/courses/30/lessons/178871

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(solution(name, yearning, photo)));

    }


    /**
     * @param name     : 인물 이름
     * @param yearning : 점수
     * @param photo    : 사진 속 인물의 이름 이차 배열
     * @return
     */
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int count = 0;
            for (String p : photo[i]) {
                count += map.getOrDefault(p, 0);
            }
            answer[i] = count;
        }

        return answer;
    }

}

