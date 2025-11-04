package codingTest.demo.codeUp.programmers.cote_2025.cote_2511;

import java.util.Arrays;

public class S25110401 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/161990

    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};

        System.out.println(Arrays.toString(solution(wallpaper)));
    }


    /**
     * @param wallpaper : 바탕화면 1차 배열 : #이 파일 존재
     * @return
     */
    public static int[] solution(String[] wallpaper) {
        int sx = 99, sy = 99;
        int ex = 0, ey = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String s = wallpaper[i];
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if ('#' == (s.charAt(j))) {
                    sx = Math.min(sx, i);
                    sy = Math.min(sy, j);
                    ex = Math.max(ex, i);
                    ey = Math.max(ey, j);
                }
            }
        }

        return new int[]{sx, sy, ex + 1, ey + 1};
    }

}

