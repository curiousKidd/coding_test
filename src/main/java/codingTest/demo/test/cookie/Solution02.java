package codingTest.demo.test.cookie;

import java.util.Arrays;

public class Solution02 {

    public static void main(String[] args) {

        int capacity = 8;  // 배달부가 들수있는 최대 선물의 갯수
//        int[][] routes = {{5, 1, 15}, {14,3,18},{3,15,21}, {9,14,52}};   // {선물갯수, 시작위치, 도착위치}
        int[][] routes = {{3, 12, 16}, {8, 2, 12},{1, 14, 15}};   // {선물갯수, 시작위치, 도착위치}

        System.out.println("solution(capacity, routes) = " + solution2(capacity, routes));

    }

    public static boolean solution(int capacity, int[][] routes) {
//        boolean answer = true;

        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

        int[] to_from = new int[1001];



        int currentCapacity = capacity;

//        for (int[] route : routes) {
//
//
//            int numGifts = route[0];
//            int start = route[1];
//            int end = route[2];
//
//            currentCapacity -= numGifts;
//            if (currentCapacity < 0) {
//                return false;  // 최대 선물 갯수를 초과하면 배달을 마무리할 수 없음
//            }
//
//            // 선물 배달이 끝난 후 배달부의 위치를 업데이트
//            currentCapacity += numGifts;
//            currentCapacity = Math.min(currentCapacity, capacity);  // 최대 용량을 초과하지 않도록 처리
//        }

        return true;  // 모든 선물 배달을 마무리할 수 있음
    }

    public static boolean solution2(int capacity, int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

        int sum = 0;
        int[] to_from = new int[1001];

        for (int i = 0; i < 1001; i++) {
            if(i < routes.length){
                if(to_from[routes[i][1]] == 0){
                    to_from[routes[i][1]] = routes[i][0];
                }else{
                    to_from[routes[i][1]] = to_from[routes[i][1]] +  routes[i][0];
                }
                if(to_from[routes[i][2]] == 0){
                    to_from[routes[i][2]] = routes[i][0] * -1;
                }else{
                    to_from[routes[i][2]] = to_from[routes[i][2]] + (routes[i][0] * -1);
                }
            }

            if(to_from[i] != 0){
                sum += to_from[i];

                if(sum > capacity) return false;
            }


        }

        return true;
    }


}


