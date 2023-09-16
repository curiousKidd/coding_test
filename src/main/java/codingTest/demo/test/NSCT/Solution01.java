package codingTest.demo.test.NSCT;

public class Solution01 {

    public static void main(String[] args) {
        int n = 8;
        int m = 6;
        int[][] paper = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                paper[i][j] = 1;
            }
        }

        int[] fold = {1, -1, -1};
        int[][] cut = {{1, 1}, {2, 2}, {4, 4}};

        int[][] solution = solution(paper, fold, cut);

        // 결과를 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int[][] solution(int[][] paper, int[] fold, int[][] cuts) {
        int x = 8; //세로 : n
        int y = 6; // 가로 : m

        // -1 가로로 n * m/2
        for (int l : fold) {
            if (l < 0) {
                x /= 2;
            } else {
                y /= 2;
            }
        }


        // x =2
        // y = 3
        for (int[] cut : cuts) {
            if (x < cut[0] - 1 || y < cut[1] - 1) continue;
            paper[cut[0] - 1][cut[1] - 1] = 0;
        }

        for (int l : fold) {
            // x =4
            if (l > 0) {
                x *= 2;
                for (int i = 0; i < x / 2; i++) { // x
                    for (int j = 0; j < y; j++) { // x
                        paper[x - i][j] = paper[i][j];
                    }
                }
            } else {
                y *= 2;
                for (int i = 0; i < x; i++) { // x
                    for (int j = 0; j < y / 2; j++) { // x
                        paper[x][j - j] = paper[i][j];
                    }
                }
            }
        }

        return paper;
    }

    public static void solve(int[][] paper, int[] fold, int[][] cuts) {
        for (int[] cut : cuts) {
            int x = cut[0] - 1;
            int y = cut[1] - 1;
            paper[x][y] = 0;

            for (int l : fold) {
                if (l < 0) {
                    System.out.println("x = " + x);
                    x *= 2;
                    paper[x][y] = 0;
                } else {
                    System.out.println("y = " + y);
                    y *= 2;
                    paper[x][y] = 0;
                }
            }
        }
    }
}
