package codingTest.demo.codeUp.programmers.cote_20230816;

import java.util.LinkedList;
import java.util.Queue;

public class truckPassingBridge {

    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};


    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int sum = 0;

        Queue<Integer> q = new LinkedList<>();

        q.add(truck_weights[0]);
        while (!q.isEmpty()){
            Integer peek = q.peek();

            sum += peek;

        }

        return answer;
    }
}
