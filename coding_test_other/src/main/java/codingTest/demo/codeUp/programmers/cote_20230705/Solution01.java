package codingTest.demo.codeUp.programmers.cote_20230705;

import java.util.Arrays;

public class Solution01 {

    public static void main(String[] args) {
        Solution01 solution = new Solution01();

        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;

        System.out.println("solution = " + Arrays.toString(solution.solution2(sequence, k)));

    }

    public int[] solution(int[] sequence, int k) {
        int[] answer = {-1, sequence[sequence.length - 1]};

        for (int i = 0; i < sequence.length; i++) {
            int value = k;

            value -= sequence[i];

            if (value < 0) continue;
            else if (value == 0) {
                answer = new int[]{i, i};
                break;
            }

            for (int j = i + 1; j < sequence.length; j++) {
                value -= sequence[j];
                if (value < 0) break;
                else if (value == 0) {
                    if (answer[1] - answer[0] > j - i)
                        answer = new int[]{i, j};

                }
            }
        }

        return answer;
    }

    public int[] solution2(int[] sequence, int k) {
        int[] answer = {-1, sequence[sequence.length - 1]};
        int sum = 0;
        int start = 0;
        int end = 0;

        while (end <= sequence.length) {
            if (sum >= k) {
                if (answer[1] - answer[0] > end - start) {
                    answer[0] = start;
                    answer[1] = end - 1;
                }
                sum -= sequence[start];
                start++;
            } else {
                if (end == sequence.length) break;
                sum += sequence[end];
                end++;
            }
        }

        if (answer[0] == -1) answer[1] = -1;

        return answer;
    }

    public int[] solution3(int[] sequence, int k) {
        int[] result = new int[2];
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = sequence[0];

        while (start < sequence.length) {
            if (sum == k) {
                int len = end - start + 1;
                if (len < minLen) {
                    minLen = len;
                    result[0] = start;
                    result[1] = end;
                }

                // 다음 부분 수열 검사를 위해 start 인덱스 증가
                sum -= sequence[start];
                start++;
            } else if (sum < k) {
                // 부분 수열의 합이 k보다 작을 경우 end 인덱스 증가
                end++;
                if (end >= sequence.length) {
                    // 부분 수열을 찾을 수 없음
                    break;
                }
                sum += sequence[end];
            } else {
                // 부분 수열의 합이 k보다 클 경우 start 인덱스 증가
                sum -= sequence[start];
                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            // 부분 수열을 찾을 수 없는 경우
            result[0] = -1;
            result[1] = -1;
        }

        return result;
    }
}
