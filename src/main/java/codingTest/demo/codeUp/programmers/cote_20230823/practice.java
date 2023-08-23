package codingTest.demo.codeUp.programmers.cote_20230823;

public class practice {

    //    private static String replies = "AFFDEFDEFDEEC";
    private static String replies = "AACAAC";
    private static int N = 3;
    private static int K = 2;

    public static void main(String[] args) {
        System.out.println("solution() = " + solution());
    }

    public static boolean solution() {
        boolean answer = false;

        for (int i = 0; i <= replies.length() - N; i++) {
            String c = replies.substring(i, i + N);
            int k = 0;
            for (int j = 0; j <= replies.length() - N; j++) {
                if (c.equals(replies.substring(j, j + N))) k++;

                if (k == K) {
                    answer = true;
                    break;
                }

            }
        }

        return answer;
    }

}
