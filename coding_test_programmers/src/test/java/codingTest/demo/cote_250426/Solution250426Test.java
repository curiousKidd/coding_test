package codingTest.demo.cote_250426;

import codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250426.Solution250426;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution250426Test {

    @Test
    @DisplayName("nums1 = {3, 1, 2, 3} → 기대값=2")
    void testNums1() {
        int[] nums1 = {3, 1, 2, 3};
        assertEquals(2, Solution250426.solution(nums1));
    }

    @Test
    @DisplayName("nums2 = {3, 3, 3, 2, 2, 4} → 기대값=3")
    void testNums2() {
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        assertEquals(3, Solution250426.solution(nums2));
    }

    @Test
    @DisplayName("nums3 = {3, 3, 3, 2, 2, 2} → 기대값=2")
    void testNums3() {
        int[] nums3 = {3, 3, 3, 2, 2, 2};
        assertEquals(2, Solution250426.solution(nums3));
    }

    @Test
    @DisplayName("빈 배열 → 기대값=0")
    void testEmpty() {
        int[] empty = {};
        assertEquals(0, Solution250426.solution(empty));
    }

    @Test
    @DisplayName("모두 동일한 값, 짝수 개수 → 기대값=1")
    void testAllSameEven() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(1, Solution250426.solution(nums));
    }

    @Test
    @DisplayName("모두 동일한 값, 홀수 개수 → 기대값=1")
    void testAllSameOdd() {
        int[] nums = {7, 7, 7, 7, 7};
        assertEquals(1, Solution250426.solution(nums));
    }

}
