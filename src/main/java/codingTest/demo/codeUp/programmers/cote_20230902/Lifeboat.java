package codingTest.demo.codeUp.programmers.cote_20230902;

public class Lifeboat {

    public static void main(String[] args) {

        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println("solution(people, limit) = " + solution(people, limit));

    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        for (int i = 0; i < people.length; i++) {
            int sum = 0;
            if(people[i] != 0) {
                for (int j = 0; j < people.length; j++) {
                    if (sum + people[j] <= 100) {
                        sum += people[j];
                        people[j] = 0;
                    }
                }
                answer++;
            }
        }

        return answer;
    }

}
