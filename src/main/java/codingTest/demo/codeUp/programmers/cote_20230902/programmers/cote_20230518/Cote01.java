package codingTest.demo.codeUp.programmers.cote_20230518;

public class Cote01 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/12924
    // 숫자의 표현

    public static void main(String[] args) {
        Cote01 cote01 = new Cote01();

        int n = 15;

        System.out.println("cote01 = " + cote01.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int x = 0;
            for (int j = i; j <= n; j++) {
                x += j;

                if (x == n) {
                    answer += 1;
                    break;
                } else if (x > n) {
                    break;
                }
            }
        }

        return answer;
    }

    public int solution2(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }
}
