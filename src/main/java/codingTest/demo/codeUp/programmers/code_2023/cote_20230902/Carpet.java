package codingTest.demo.codeUp.programmers.code_2023.cote_20230902;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Carpet {

    public static void main(String[] args) {

        int brown = 10;
        int yellow = 2;

        System.out.println(Arrays.toString(solution(brown, yellow)));

    }

    public static int[] solution2(int brown, int yellow) {
        int sum = brown + yellow;

        ArrayList<Integer> arr = new ArrayList<>();
        int sqrt = (int) Math.sqrt(sum);

        for (int i = 1; i <= sqrt; i++) {
            if (sum % i == 0) { // 약수 중 작은 수 저장
                arr.add(i);
                if (sum / i != i) { // 약수 중 큰 수 저장
                    arr.add(sum / i);
                }
            }
        }

        arr.sort(Comparator.naturalOrder());

        if (arr.size() % 2 == 0) {
            int x = arr.size() / 2;
            return new int[]{arr.get(x), arr.get(x - 1)};
        } else {
            int i = arr.size() / 2;
            return new int[]{arr.get(i), arr.get(i)};
        }

    }

    public static int[] solution(int brown, int yellow) {
        int sum = brown + yellow;

        // width, height 또한 최소 길이가 3
        for (int width = 3; width <= sum / 3; width++) {
            if (sum % width == 0) {
                int height = sum / width;
                int brownTiles = 2 * (width + height) - 4;

                if (brownTiles == brown) {
                    return new int[]{Math.max(width, height), Math.min(width, height)};
                }
            }
        }

        return new int[]{0, 0}; // 문제 조건을 만족하는 경우를 찾지 못한 경우에 대한 처리
    }

}
