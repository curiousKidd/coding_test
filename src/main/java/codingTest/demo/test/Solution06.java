package codingTest.demo.test;

import java.util.Arrays;
import java.util.Comparator;

public class Solution06 {

    public static void main(String[] args) {
        int[] prices1 = {10, 7, 8, 5, 8, 7, 6, 2, 9};
        int k1 = 3;
        System.out.println(solution(prices1, k1)); // Expected output: 9

        int[] prices2 = {10, 7, 8, 5, 6, 4, 3, 2, 3};
        int k2 = 3;
        System.out.println(solution(prices2, k2)); // Expected output: -1

        int[] prices3 = {15, 7, 8, 5, 6, 4, 3, 9};
        int k3 = 4;
        System.out.println(solution(prices3, k3)); // Expected output: 2
    }

    public static int solution(int[] prices, int k) {
        int sum = 0;
        int buyPrice = Integer.MAX_VALUE;

        int x = 0;
        for (int i = 0; i < prices.length - k; i++) {
            if (prices[i] < buyPrice) {
                    buyPrice = prices[i];
                    x = i;
            }
        }

        int[] subArray = Arrays.copyOfRange(prices, x, prices.length);
        Integer[] wrapperArray = Arrays.stream(subArray).boxed().toArray(Integer[]::new);
        Arrays.sort(wrapperArray, Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
             sum += wrapperArray[i];
        }

        sum = sum - (buyPrice*k);

        if (sum <= 0) {
            return -1;
        }

        return sum;
    }





}
