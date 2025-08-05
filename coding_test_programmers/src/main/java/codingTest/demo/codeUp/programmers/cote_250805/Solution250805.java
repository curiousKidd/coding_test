package codingTest.demo.codeUp.programmers.cote_250805;

public class Solution250805 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/389479
    // 서버 증설 회수

    public static void main(String[] args) {
        int[] players = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};


        System.out.println("solution(sizes) = " + solution(players, 3, 5));
    }

    public static int solution(int[] players, int m, int k) {
        int answer = 0;

        int[] servers = new int[24];

        int serverCnt = 1;
        for (int i = 0; i < 24; i++) {
            serverCnt = serverCnt - servers[i];

            int otherUser = players[i] - (serverCnt * m);
            int plusServerCnt = otherUser % m == 0 ? otherUser / m : otherUser / m + 1;

            serverCnt += plusServerCnt;
            if (i < 19) {
                servers[i + 5] = plusServerCnt;
            }

            answer += plusServerCnt;
        }

        return answer;
    }

}
