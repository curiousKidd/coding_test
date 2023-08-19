package codingTest.demo.test;

public class Solution04 {

    public static void main(String[] args) {
        int A = 10;
        int B = 10;
        int C = 3;
        int D = 2;
        int N = 7;
        int[][] Chips = {{2, 2}, {2, 3}, {2, 4}, {6, 2}, {6, 3}, {6, 4}, {3, 5}};

        Solution04 solution = new Solution04();
        int result = solution.solution(A, B, C, D, N, Chips);
        System.out.println(result);
    }

    public int solution(int A, int B, int C, int D, int N, int[][] Chips) {
        // 케이크: A cm x B cm
        // 직사각형 틀: C cm x D cm
        // 초콜릿 칩: N개
        // 초콜릿 칩의 좌표 xn, yn: (Chips[n-1][0], Chips[n-1][1])
        int answer = 0;

        // 초콜릿을 배치할 수 있는 가로, 세로의 칸 수
        int horizontal = A - C + 1;
        int vertical = B - D + 1;

        // 각 칸에 있는 초콜릿 칩의 개수를 저장하는 2차원 배열
        int[][] chipCount = new int[horizontal][vertical];

        // 초콜릿 칩의 좌표에 따라 chipCount 배열에 개수를 증가시킴
        for (int i = 0; i < N; i++) {
            int x = Chips[i][0] - 1; // 좌표를 0부터 시작하도록 수정
            int y = Chips[i][1] - 1; // 좌표를 0부터 시작하도록 수정
            chipCount[x][y]++;
        }

        // 가장 많은 초콜릿 칩이 있는 칸의 개수를 찾음
        for (int i = 0; i < horizontal; i++) {
            for (int j = 0; j < vertical; j++) {
                answer = Math.max(answer, chipCount[i][j]);
            }
        }

        return answer;
    }

}
