package codingTest.demo.codeUp.programmers.code_2023.cote_20230416;

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

        // 2차 배열을 for문에서 돌림으로 0 ~ N까지의 모든 경우의 수를 사용 할 수 있게 된다.

        for (int i = 0; i < (1 << n); i++) { // 2진수로 나타낼 수 있는 모든 경우의 수
            System.out.println("i = " + i);
            int total = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    total += numbers[j]; // 더하기
                    System.out.println("j1 = " + j);
                } else {
                    total -= numbers[j]; // 빼기
                    System.out.println("j2 = " + -j);
                }
            }
            if (total == target) {
                answer++;
            }
        }
        return answer;
    }

}
