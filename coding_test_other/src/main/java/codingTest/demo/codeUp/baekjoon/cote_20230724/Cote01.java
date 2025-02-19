package codingTest.demo.codeUp.baekjoon.cote_20230724;

public class Cote01 {

    public static void main(String[] args) {

        Cote01 cote = new Cote01();

        int n = 4;
        long[] road = {2, 3, 1};
        long[] city = {5, 2, 4, 1};

        //        int[] road = {3, 3, 4};
        //        int[] city = {1, 1, 1, 1};

        System.out.println("solution = " + cote.solution(n, road, city));

    }

    public long solution(int n, long[] road, long[] city) {
        long result = 0;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            if (min > city[i]) {
                min = city[i];
            }
            result += road[i] * min;

        }

        return result;
    }
}
