package codingTest.demo.codeUp.programmers;

public class S25102002 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/388351

    public static void main(String[] args) {

//        System.out.println(solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"}));  // 예: 적당한 케이스
        System.out.println(solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"}));  // 예: 적당한 케이스
//        System.out.println(solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"}));  // 예: 적당한 케이스
    }

    /**
     * @param video_len : 비디오 길이
     * @param pos       : 현재 위치
     * @param op_start  : 오프닝 시작
     * @param op_end    : 오프닝 종료
     * @param commands  : 동작 배열
     * @return
     */
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] posTimeSplit = pos.split(":");
        int[] posTime = new int[]{Integer.parseInt(posTimeSplit[0]), Integer.parseInt(posTimeSplit[1])};

        getPosTimeWithOpningTimeCheck(video_len, posTime, op_start, op_end);

        for (String command : commands) {
            int mm = posTime[0];
            int ss = posTime[1];
            switch (command) {
                case "prev":
                    ss -= 10;
                    if (ss < 0) {
                        boolean b = mm > 0;
                        mm = b ? mm - 1 : 0;
                        ss = b ? ss + 60 : 0;
                    }
                    break;
                case "next":
                    ss += 10;
                    if (ss >= 60) {
                        mm += 1;
                        ss -= 60;
                    }
                    break;
                default:
                    break;
            }

            posTime[0] = mm;
            posTime[1] = ss;

            getPosTimeWithOpningTimeCheck(video_len, posTime, op_start, op_end);
        }

        return String.format("%02d:%02d", posTime[0], posTime[1]);
    }

    public static void getPosTimeWithOpningTimeCheck(String video_len, int[] pos, String op_start, String op_end) {
        String[] opStartTimeSplit = op_start.split(":");
        String[] opEndTimeSplit = op_end.split(":");
        String[] videoLenTimeSplit = video_len.split(":");

        int posTime = pos[0] * 60 + pos[1];
        int opStartTime = Integer.parseInt(opStartTimeSplit[0]) * 60 + Integer.parseInt(opStartTimeSplit[1]);
        int opEndTime = Integer.parseInt(opEndTimeSplit[0]) * 60 + Integer.parseInt(opEndTimeSplit[1]);
        int videoLen = Integer.parseInt(videoLenTimeSplit[0]) * 60 + Integer.parseInt(videoLenTimeSplit[1]);


        if (posTime >= opStartTime && posTime < opEndTime) posTime = opEndTime;

        if (posTime > videoLen) posTime = videoLen;

        int m = posTime / 60;
        int s = posTime % 60;

        pos[0] = m;
        pos[1] = s;
    }
}

