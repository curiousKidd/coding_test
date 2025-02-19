package codingTest.demo.codeUp.baekjoon.cote_20230619;

public class Cote01 {

    public static void main(String[] args) {

        Cote01 cote01 = new Cote01();

        long N = 200;

        System.out.println("N = " + cote01.solution(N));

    }

    public long solution(long N) {
        long answer = 0;
        long sum = 0;

        for (long i = 1; i < N; i++) {
            if (sum >= N) {
                break;
            }

            sum += i;
            answer = i - 1;
        }

        return answer;
    }
}
