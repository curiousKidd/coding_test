package codingTest.demo.codeUp.programmers.cote_20230519;

public class Cote01 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42860
    // 탐욕법(Greedy) > 조이스틱

    public static void main(String[] args) {

        Cote01 cote01 = new Cote01();

        String name = "JAZ";

        System.out.println("cote01 = " + cote01.solution(name));
    }

    public int solution(String name) {
        int answer = -1;

        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (c <= 'N') {
                answer++;
                answer += c - 'A';
            } else {
                answer++;
                answer += (c - 'A') - ((c - 'N') * 2);
            }
        }

        return answer;
    }
}
