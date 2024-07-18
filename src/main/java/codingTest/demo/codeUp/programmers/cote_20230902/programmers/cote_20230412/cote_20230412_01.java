package codingTest.demo.codeUp.programmers.cote_20230412;

public class cote_20230412_01 {

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};

        cote_20230412_01 cote = new cote_20230412_01();

        System.out.println("value = " + cote.solution(arr));
    }

    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = multple(answer, arr[i]);
        }

        return answer;
    }

    private int divisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        {
            return divisor(b, a % b);
        }
    }

    private int multple(int a, int b) {
        return a * b / divisor(a, b);
    }
}
