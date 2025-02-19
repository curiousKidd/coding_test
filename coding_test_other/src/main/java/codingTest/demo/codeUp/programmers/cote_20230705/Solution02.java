package codingTest.demo.codeUp.programmers.cote_20230705;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Solution02 {

    public static void main(String[] args) {

        Solution02 solution = new Solution02();

        String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};

        System.out.println("solution = " + Arrays.toString(solution.solution(plans)));
    }

    public String[] solution(String[][] plans) {
        List<String> finishedTasks = new ArrayList<>(); // 끝난 과제를 저장할 리스트
        LocalTime currentTime = LocalTime.of(0, 0); // 현재 시각
        Stack<String[]> stack = new Stack<>();

        Arrays.sort(plans, Comparator.comparing(o -> o[1]));

        String[] strings = null;

        for (int i = 0; i < plans.length; i++) {
            System.out.println("i = " + plans[i][0]);
            if (stack.empty()) {
                stack.push(plans[i]);
                continue;
            }

            // 과제의 마지막 타임이라면
            if (i == plans.length - 1) {
                finishedTasks.add(plans[i][0]);

                while (!stack.empty()) {
                    System.out.println("stack = " + stack.peek()[0]);
                    finishedTasks.add(stack.pop()[0]);
                }

                break;
            }

            do {
                String[] peek = stack.pop();

                System.out.println("peek[1] = " + peek[0]);

                LocalTime nextTime = LocalTime.parse(plans[i][1]); // 과제 시작 시각
                LocalTime stackTime = LocalTime.parse(peek[1]); // 미뤄둔 과제 시간
                long stackAddTime = Integer.parseInt(peek[2]); // 과제 소요 시간

                long diffTime = Duration.between(stackTime.plusMinutes(stackAddTime), nextTime).toMinutes();
                System.out.println("diffTime = " + diffTime);
                if (diffTime >= 0) {
                    System.out.println("---------------- = " + plans[i][0]);
                    finishedTasks.add(peek[0]); // 과제를 끝낸 순서대로 이름을 추가
                } else {
                    System.out.println("**************** = " + plans[i][0]);
                    peek[2] = Long.toString(stackAddTime - diffTime);
                    stack.push(peek);
                    stack.push(plans[i]);
                    break;
                }

            } while (!stack.empty());

        }

        return finishedTasks.toArray(new String[0]); // 리스트를 배열로 변환하여 반환
    }

}
