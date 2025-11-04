package codingTest.demo.codeUp.programmers.cote_2025.cote_2511;

public class S25110402 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/161989

    public static void main(String[] args) {
        System.out.println((solution(4, 1, new int[]{1, 2, 3, 4})));
    }


    /**
     * @param n       : 벽 길이
     * @param m       : 롤러 길이
     * @param section : 칠해야하는 벽 배열
     * @return
     */
    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = section[0];
        int end = section[0];
        for (int i : section) {
            if (i - start >= m) {
                start = i;
                answer++;
            }

            end = Math.max(end, i);
        }

        answer++;

        return answer;
    }

}

