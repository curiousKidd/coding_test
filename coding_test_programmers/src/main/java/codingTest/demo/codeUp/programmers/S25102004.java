package codingTest.demo.codeUp.programmers;

import java.util.Arrays;
import java.util.Objects;

public class S25102004 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/388351

    public static void main(String[] args) {
        String[][] park = {{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};
        System.out.println(solution(new int[]{5, 3, 2}, park));
    }

    /**
     * @param mats : 돗자리 길이(정사각형) 배열
     * @param park : 공원 자리 배치도
     * @return
     */
    public static int solution(int[] mats, String[][] park) {
        int r = park.length;
        int c = park[0].length;

        Arrays.sort(mats);

        for (int i = mats.length - 1; i >= 0; i--) {
            int mat = mats[i];
            System.out.println("mat = " + mat);

            if (mat > r || mat > c) continue;

            if (getSize(park, mat)) return mat;
        }


        return -1;
    }

    private static boolean getSize(String[][] park, int size) {
        for (int x = 0; x < park.length; x++) {
            for (int y = 0; y < park[x].length; y++) {
                if (isSizeCheck(park, x, y, size)) return true;
            }
        }

        return false;
    }


    private static boolean isSizeCheck(String[][] park, int sx, int sy, int size) {
        for (int x = sx; x < park.length; x++) {
            for (int y = sy; y < park[x].length; y++) {
                if (!Objects.equals(park[x][y], "-1")) return false;
            }
        }

        return true;
    }

}

