package demo.codeUp.baekjoon.cote_20230523;

public class Cote02 {

    // https://www.acmicpc.net/problem/5585
    // 그리디 알고리즘 > 거스름돈

    public static void main(String[] args) {
        Cote02 cote02 = new Cote02();

        int price = 380;

        System.out.println("cote02 = " + cote02.solution(price));
    }

    public int solution(int price) {
        int answer = 0;

        int a = 1000 - price;

        int[] priceArray = {500, 100, 50, 10, 5, 1};
        int i = 0;

        while (a != 0) {
            if (priceArray[i] > a) {
                i++;
                continue;
            }

            a -= priceArray[i];
            answer++;
        }

        return answer;
    }

}
