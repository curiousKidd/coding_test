package codingTest.demo.test.gabiCT;

public class Solution02 {

    public static void main(String[] args) {
        int n = 4; // n은 줄과 열의 개수입니다. 예시에서는 3으로 주어졌습니다.

        // 6
        int result = solution(n);
        System.out.println("서로 다른 네 점을 이어 만들 수 있는 정사각형의 개수는 " + result + "개 입니다.");

        //4 => 20
    }


    public static int solution(int n) {
        int answer = 0;

        for (int i = n - 1; i >= 1; i--) {
            System.out.println("i1 = " + i);
            answer += Math.pow(i, 2);
        }

        for (int i = n - 2; i >= 1; i--) {
            System.out.println("i = " + i);
            answer += Math.pow(i, 2);
        }

        return answer;
    }
}
