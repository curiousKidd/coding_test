package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250805;

public class Solution250805 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/389479
    // 서버 증설 회수

    public static void main(String[] args) {
        int[] players1 = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};
        int[] players2 = {0, 0, 0, 10, 0, 12, 0, 15, 0, 1, 0, 1, 0, 0, 0, 5, 0, 0, 11, 0, 8, 0, 0, 0};
        int[] players3 = {0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1};


//        System.out.println("solution(sizes) = " + solution(players1, 3, 5)); // 7
        System.out.println("solution(sizes) = " + solution(players2, 5, 1)); // 11
        System.out.println("solution(sizes) = " + solution(players3, 1, 1)); // 12
    }

    public static int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] addServers = new int[24];
        int serverCnt = 1;

        for (int i = 0; i < 24; i++) {
            serverCnt = serverCnt - addServers[i];

            int otherUser = Math.max(players[i] - ((serverCnt * m) - 1), 0);
            int addServerCnt = otherUser % m == 0 ? otherUser / m : otherUser / m + 1;

            serverCnt += addServerCnt;
            if (i < 24 - k) {
                addServers[i + k] = addServerCnt;
            }

            answer += addServerCnt;
        }

        return answer;
    }

}
