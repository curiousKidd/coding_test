package codingTest.demo.codeUp.programmers.cote_20230902;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Lifeboat {

    public static void main(String[] args) {

        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println("solution(people, limit) = " + solution(people, limit));

    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        int left = 0;
        int right = people.length - 1;

        Arrays.sort(people);

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            answer++;
        }

        return answer;
    }

}
