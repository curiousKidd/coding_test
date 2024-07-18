package codingTest.demo.codeUp.programmers.cote_20230703;

public class Solution02 {

    public static void main(String[] args) {

        Solution02 solution = new Solution02();

        int r1 = 2;
        int r2 = 3;

        //        System.out.println("solution = " + solution.solution(r1, r2));

        System.out.println("test = " + solution.test(r1, r2));
    }

    public long solution(int r1, int r2) {
        long answer = 4;

        for (int i = r2 - 1; i >= r1; i--) {
            answer += ((i * 2) + 1) * 4 - 4;
            System.out.println("i = " + (((i * 2) + 1) * 4 - 4));
        }

        return answer;
    }

    private long test(int r1, int r2) {
        long answer = 4;

        long defaultCount = ((r2 - r1 + 1) * 4L) - ((r2 - r1) * 4L);     // 원의 외접한 점의 갯수
        long doubleCount = 0;                       // n * n 처럼 겹쳤을때의 갯수
        long count = 0;

        for (int x = 0; x <= r2 + 1; x++) {
            count += (-(x - 1) + Math.sqrt(2 * r2 * r2 - Math.pow(x - 1, 2)) / 2) - (-((x - 1) + Math.sqrt(2 * r2 * r2 - Math.pow(x - 1, 2)) / 2)) + 1;
        }

        for (int j = 0; j <= r1 + 1; j++) {
            count -= (-(j - 1) + Math.sqrt(2 * r2 * r2 - Math.pow(j - 1, 2)) / 2) - (-((j - 1) + Math.sqrt(2 * r2 * r2 - Math.pow(j - 1, 2)) / 2)) + 1;
        }

        return count;
    }
}
