package codingTest.demo.codeUp.programmers.cote_2025.cote_2511;

public class S25110601 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/159994

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1, cards2, goal));
    }


    /**
     * @param cards1 : 단어 배열 1
     * @param cards2 : 단어 배열 2
     * @param goal   : 만들어야하는 문장
     * @return
     */
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1Index = 0;
        int card2Index = 0;

        for (String g : goal) {
            String card1 = "";
            String card2 = "";

            if (card1Index < cards1.length) {
                card1 = cards1[card1Index];
            }
            if (card2Index < cards2.length) {
                card2 = cards2[card2Index];
            }


            System.out.println("g = " + g);
            System.out.println("card1 = " + card1);
            System.out.println("card2 = " + card2);

            if (g.equals(card1)) card1Index++;
            else if (g.equals(card2)) card2Index++;
            else return "No";
        }

        return answer;
    }
}


