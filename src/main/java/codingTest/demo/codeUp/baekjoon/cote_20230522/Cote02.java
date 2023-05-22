package codingTest.demo.codeUp.baekjoon.cote_20230522;

public class Cote02 {

    public static void main(String[] args) {

        String s = "55-50+40-20";

        Cote02 cote02 = new Cote02();

        System.out.println("cote02 = " + cote02.solution(s));

    }

    public int solution(String s) {
        int answer = 0;

        String[] text = s.split("-");

        for (int i = 0; i < text.length; i++) {
            int sum = 0;
            String[] split = text[i].split("\\+");
            for (String b : split) {
                sum += Integer.parseInt(b);
            }
            if (i == 0) {
                answer += sum;
            } else {
                answer -= sum;
            }
        }

        return answer;
    }
}
