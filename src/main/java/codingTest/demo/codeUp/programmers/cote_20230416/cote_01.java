package codingTest.demo.codeUp.programmers.cote_20230416;

public class cote_01 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/43165

    public static void main(String[] args) {
        cote_01 cote = new cote_01();

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        int solution = cote.solution(numbers, target);

        System.out.println("solution = " + solution);

    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        int n = numbers.length;
        for (int i = 0; i < (1 << n); i++) { // 2진수로 나타낼 수 있는 모든 경우의 수
            int total = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    total += numbers[j]; // 더하기
                } else {
                    total -= numbers[j]; // 빼기
                }
            }
            if (total == target) {
                answer++;
            }
        }
        return answer;
    }

}
