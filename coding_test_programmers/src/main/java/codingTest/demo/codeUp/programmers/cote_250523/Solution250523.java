package codingTest.demo.codeUp.programmers.cote_250523;

public class Solution250523 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42578
    // 해시 > 의상

    public static void main(String[] args) {

        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(clothes1)); // 5
        System.out.println(solution(clothes2)); // 3
    }

    public static int solution(String[][] clothes) {
        int answer = 0;

        String[][] filter = new String[clothes.length][clothes.length];

        return answer;
    }

}
