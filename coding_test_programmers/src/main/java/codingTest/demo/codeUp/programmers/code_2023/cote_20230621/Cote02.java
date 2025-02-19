package codingTest.demo.codeUp.programmers.code_2023.cote_20230621;

public class Cote02 {

    public static void main(String[] args) {

        Cote02 cote02 = new Cote02();

        String number = "9876543219999999999999999999999999888888888888889797996969797959494994949999999999999994999999995599999999999999";
        int k = 20;

        //775841
        System.out.println("cote02 = " + cote02.solution(number, k));
    }

    public String solution(String number, int k) {
        String answer = number;
        int x = k;

        char max = '0';
        int count = 0;
        int i = 0;
        String text = "";

        while (true) {
            if (max < answer.charAt(i)) {
                max = answer.charAt(i);
                count = i;
            }

            if (i == x) {
                x -= count;
                text += Character.toString(answer.charAt(count));
                answer = answer.substring(count + 1, answer.length());

                if (text.length() == number.length() - k) {
                    answer = text;
                    break;
                }

                max = 0;
                count = 0;
                i = 0;

                continue;
            }

            i++;

        }

        return answer;
    }
}

//4177252841
//  77 5 841