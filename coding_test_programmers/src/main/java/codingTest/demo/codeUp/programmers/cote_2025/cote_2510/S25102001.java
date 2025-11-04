package codingTest.demo.codeUp.programmers.cote_2025.cote_2510;

public class S25102001 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/388351

    public static void main(String[] args) {
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int[][] timelogs2 = {{710, 700, 650, 735, 700, 931, 912}, {908, 901, 805, 815, 800, 831, 835}, {705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}};

        System.out.println(solution(new int[]{700, 800, 1100}, timelogs, 5));  // 예: 적당한 케이스
        System.out.println(solution(new int[]{730, 855, 700, 720}, timelogs2, 1));  // 예: 적당한 케이스
    }

    /**
     * schedules: 출근 희망 시간 배열
     * timelogs: 출근 기록 배열
     * startday: 이벤트 시작 요일 > 1은 월요일, 2는 화요일, 3은 수요일, 4는 목요일, 5는 금요일, 6은 토요일, 7은 일요일에 이벤트를 시작했음을 의미
     */
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        // 직원 수
        int n = schedules.length;

        for (int i = 0; i < n; i++) {
            // 출근 희망 시각
            int time = schedules[i];
            int h = time / 100;
            int m = time % 100;

            if (m >= 50) {
                h += 1;
                m -= 50;
            } else {
                m += 10;
            }

            int endTime = (h * 100) + m;


            // 출근 기록
            int[] timelog = timelogs[i];

            // 출근 성공 수
            int count = 0;

            // 출근 요일
            int day = startday;
            for (int j : timelog) {
                if (day > 5) count++;
                else if (endTime >= j) {
                    count++;
                } else {
                    break;
                }

                day = day % 7 + 1;
            }
            if (count == 7) answer++;
        }

        return answer;
    }
}

