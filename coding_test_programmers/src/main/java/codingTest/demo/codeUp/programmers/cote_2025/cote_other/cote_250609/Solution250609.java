package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250609;

public class Solution250609 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42860
    // 탐욕법 > 조이스틱

    public static void main(String[] args) {
        String name1 = "JEROEN";
        // 74, 69, 82, 79, 69, 78
        // 9 4 9 4 13 12
        // 18 22 26 39 51
        String name2 = "JAN";

        //        System.out.println("solution(name1) = " + solution(name1)); // 56
        System.out.println("solution(name2) = " + solution(name2)); // 23
    }

    public static int solution(String name) {
        int n = name.length();
        int answer = 0;
        // abcdefghijklm || nopqrstuvwxyz      // 26
        // 65 ...                            78 79 80 ... 90
        //                             13 14 15
        //                             13 12 11

        for (char c : name.toCharArray()) {
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }

        int move = n - 1;  // 기본: 끝까지 쭉 ▶ 이동
        for (int i = 0; i < n; i++) {
            int next = i + 1;
            // 연속된 A 건너뛰기
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }
            // 두 가지 경로 계산
            int distance1 = i * 2 + (n - next);
            int distance2 = (n - next) * 2 + i;
            move = Math.min(move, Math.min(distance1, distance2));
        }

        return answer + move;
    }
}
