package codingTest.demo.codeUp.inflearn.section02_array;

import java.util.ArrayList;
import java.util.Scanner;

public class OutputLargeNumber {

    /**
     * 큰 수 출력하기
     * <p>
     * N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작
     * 성하세요.(첫 번째 수는 무조건 출력한다)
     * <p>
     * ▣ 입력설명
     * 첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
     * <p>
     * ▣ 출력설명
     * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
     * <p>
     * ▣ 입력예제 1
     * 6
     * 7 3 9 5 6 12
     * <p>
     * ▣ 출력예제 1
     * 7 9 6 12
     */

    public static void main(String[] args) {
        OutputLargeNumber T = new OutputLargeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }
        return answer;
    }

}
