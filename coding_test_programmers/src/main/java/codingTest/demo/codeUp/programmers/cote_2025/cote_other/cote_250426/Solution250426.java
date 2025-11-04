package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250426;

import java.util.HashMap;
import java.util.Map;

public class Solution250426 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/1845
    //폰켓몬

    public static void main(String[] args) {

        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
        System.out.println(solution(nums3));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (map.size() < nums.length / 2) {
            answer = map.size();
        } else {
            answer = nums.length / 2;
        }

        return answer;
    }

}
