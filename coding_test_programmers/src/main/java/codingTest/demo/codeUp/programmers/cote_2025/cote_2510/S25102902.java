package codingTest.demo.codeUp.programmers.cote_2025.cote_2510;

import java.util.Arrays;
import java.util.Map;

public class S25102902 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/172928

    public static void main(String[] args) {
//        String[] park = {"SOO", "OOO", "OOO"};
//        String[] routes = {"E 2", "S 2", "W 1"};

        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};

        System.out.println(Arrays.toString(solution2(park, routes)));
// 예상 출력: [19, 15, 6]


    }


    /**
     * @param park   공원의 넓이
     * @param routes
     * @return
     */
    public static int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int r = 0, c = 0;
        // 시작점 탐색
        outer:
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    r = i;
                    c = j;
                    break outer;
                }
            }
        }

        Map<String, Integer> dRow = Map.of("N", -1, "S", 1, "W", 0, "E", 0);
        Map<String, Integer> dCol = Map.of("N", 0, "S", 0, "W", -1, "E", 1);

        for (String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int len = Integer.parseInt(parts[1]);

            int nr = r, nc = c;
            boolean ok = true;
            for (int k = 0; k < len; k++) {
                nr += dRow.get(dir);
                nc += dCol.get(dir);
                if (nr < 0 || nr >= h || nc < 0 || nc >= w) {
                    ok = false;
                    break;
                }
                if (park[nr].charAt(nc) == 'X') {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                r = nr;
                c = nc;
            }
        }

        return new int[]{r, c};

    }

    public static int[] solution2(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int r = 0, c = 0;
        // 시작점 탐색
        outer:
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    r = i;
                    c = j;
                    break outer;
                }
            }
        }

        Map<String, Integer> dRow = Map.of("N", -1, "S", 1, "W", 0, "E", 0);
        Map<String, Integer> dCol = Map.of("N", 0, "S", 0, "W", -1, "E", 1);

        for (String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int len = Integer.parseInt(parts[1]);

            int nr = r, nc = c;
            boolean ok = true;
            for (int k = 0; k < len; k++) {
                nr += dRow.get(dir);
                nc += dCol.get(dir);
                if (nr < 0 || nr >= h || nc < 0 || nc >= w) {
                    ok = false;
                    break;
                }
                if (park[nr].charAt(nc) == 'X') {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                r = nr;
                c = nc;
            }
        }

        return new int[]{r, c};

    }
}

