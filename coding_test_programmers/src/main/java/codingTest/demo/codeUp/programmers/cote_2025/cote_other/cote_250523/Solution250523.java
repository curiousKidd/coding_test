package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250523;

import java.util.HashMap;
import java.util.Map;

public class Solution250523 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42578
    // 해시 > 의상

    public static void main(String[] args) {

        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(clothes1)); // 5
        System.out.println(solution(clothes2)); // 3
    }

    public static int solution(String[][] clothes) {
        // 의상 종류별 개수 세기
        Map<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            String type = cloth[1];  // [의상 이름, 의상 종류]
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // (각 종류의 아이템 수 + 1) 을 모두 곱한 뒤 —1
        int combinations = 1;
        for (int cnt : map.values()) {
            combinations *= (cnt + 1);
        }

        // 모든 종류를 다 안 입는 경우 하나를 빼준다
        return combinations - 1;
    }

}
