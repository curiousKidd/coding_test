package codingTest.demo.codeUp.programmers;

public class S25102801 {

//    https://school.programmers.co.kr/learn/courses/30/lessons/250125

    public static void main(String[] args) {

        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        System.out.println(solution(board, 1, 1));

    }


    /**
     * @param board : 보드 컬러가 적혀있는 2차원
     * @param h     : 좌표 1
     * @param w     : 좌표 2
     * @return
     */
    public static int solution(String[][] board, int h, int w) {
        int answer = 0;

        String color = board[h][w];
        int n = board.length - 1;

        if (h > 0 && color.equals(board[h - 1][w])) answer++;
        if (h < n && color.equals(board[h + 1][w])) answer++;
        if (w > 0 && color.equals(board[h][w - 1])) answer++;
        if (w < n && color.equals(board[h][w + 1])) answer++;

        return answer;
    }

}

