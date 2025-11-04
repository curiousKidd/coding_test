package codingTest.demo.codeUp.programmers.cote_2025.cote_2510;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S25102802 {

//    https://school.programmers.co.kr/learn/courses/30/lessons/250121

    public static void main(String[] args) {

        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        Arrays.stream(solution(data, "date", 20300501, "remain"))
                .forEach(d -> System.out.println(Arrays.toString(d)));

    }


    /**
     * @param data    : 데이터 들어가있는 2차 배열
     * @param ext     : 필터 필드
     * @param val_ext : 필터 기준값
     * @param sort_by : 정렬 기순값
     * @return
     */
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {


        String[] fix = {"code", "date", "maximum", "remain"};

        List<String> list = Arrays.asList(fix);
        int i = list.indexOf(ext);
        int sort = list.indexOf(sort_by);

//        HashMap<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < 4; i++) {
//            map.put(fix[i], i);
//        }
//
//        Integer i = map.get(ext);
//        Integer sort = map.get(sort_by);


        return Arrays.stream(data)
                .filter(f -> f[i] < val_ext)
                .sorted(Comparator.comparingInt(a -> a[sort]))
                .toArray(int[][]::new);
    }

}

