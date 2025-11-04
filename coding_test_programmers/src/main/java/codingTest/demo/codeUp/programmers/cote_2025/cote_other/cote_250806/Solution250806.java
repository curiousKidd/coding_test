package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250806;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution250806 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/388353
    // 지게차와 크레인

    public static void main(String[] args) {
        String[] storage1 = {"AZWQY", "CAABX", "BBDDA", "ACACA"};
        String[] requests1 = {"A", "BB", "A"};

        System.out.println("solution(storage1, requests1) = " + solution(storage1, requests1)); // 11
    }

    static final int[] DX = {-1, 1, 0, 0};
    static final int[] DY = {0, 0, -1, 1};

    public static int solution(String[] storage, String[] requests) {
        int n = storage.length, m = storage[0].length();

        // 빈칸은 '.'으로 관리
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) grid[i] = storage[i].toCharArray();

        for (String req : requests) {
            char target = req.charAt(0);

            if (req.length() == 2) {
                // 크레인: 해당 알파벳 전부 제거
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (grid[i][j] == target) grid[i][j] = '.';
                    }
                }
                continue;
            }

            // 지게차: 외부 공기에서 BFS → 외부와 맞닿은 target만 제거
            // 1) 패딩된 방문배열 (n+2) x (m+2) 에서 (0,0)은 무조건 공기
            boolean[][] vis = new boolean[n + 2][m + 2];
            Queue<int[]> q = new ArrayDeque<>();
            q.offer(new int[]{0, 0});
            vis[0][0] = true;

            // 제거 후보 모으기
            List<int[]> toRemove = new ArrayList<>();

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];

                for (int d = 0; d < 4; d++) {
                    int nx = x + DX[d], ny = y + DY[d];
                    if (nx < 0 || ny < 0 || nx >= n + 2 || ny >= m + 2) continue;
                    if (vis[nx][ny]) continue;
                    vis[nx][ny] = true;

                    // 패딩 좌표 → 원본 좌표로 변환: (nx-1, ny-1)
                    int gx = nx - 1, gy = ny - 1;
                    if (gx < 0 || gy < 0 || gx >= n || gy >= m) {
                        // 여전히 패딩 공기
                        q.offer(new int[]{nx, ny});
                    } else {
                        if (grid[gx][gy] == '.') {
                            // 빈칸 = 공기, 통과 가능
                            q.offer(new int[]{nx, ny});
                        } else if (grid[gx][gy] == target) {
                            // 외부 공기와 면을 맞댄 target → 제거 후보
                            toRemove.add(new int[]{gx, gy});
                            // 하지만 통과는 불가 (컨테이너이므로)
                        }
                        // 다른 알파벳은 공기 확장 불가
                    }
                }
            }

            // 이번 라운드 일괄 제거
            for (int[] p : toRemove) grid[p[0]][p[1]] = '.';
        }

        // 남은 컨테이너 수
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] != '.') count++;

        return count;
    }
}
