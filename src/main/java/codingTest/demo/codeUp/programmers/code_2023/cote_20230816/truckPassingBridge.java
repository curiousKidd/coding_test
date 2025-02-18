package codingTest.demo.codeUp.programmers.code_2023.cote_20230816;

import java.util.LinkedList;
import java.util.Queue;

public class truckPassingBridge {

    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        System.out.println("time = " + solution(bridge_length, weight, truck_weights));

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;

        Queue<Integer> q = new LinkedList<>();

        for (int i : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(i);
                    sum += i;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();

                } else {
                    answer++;

                    if (sum + i > weight) {
                        q.offer(0);
                    } else {
                        q.offer(i);
                        sum += i;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}
