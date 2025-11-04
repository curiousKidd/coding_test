package codingTest.demo.codeUp.programmers.cote_2025.cote_2510;

public class S25102003 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/388351

    public static void main(String[] args) {

        System.out.println(solution(new int[]{30, 15}, new int[]{26, 17}));
    }

    /**
     * @param wallet : 지갑 크기
     * @param bill   : 지폐 크기
     * @return
     */
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int walletX = Math.max(wallet[0], wallet[1]);
        int walletY = Math.min(wallet[0], wallet[1]);
        int billX = Math.max(bill[0], bill[1]);
        int billY = Math.min(bill[0], bill[1]);

        bill = new int[]{billX, billY};

        while (bill[0] > 10) {
            if (walletX < bill[0] || walletY < bill[1]) {
                billCut(bill);
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }

    public static void billCut(int[] bill) {
        int x = bill[0];
        int y = bill[1];

        int mathX = Math.max(x, y) / 2;
        int mathY = Math.min(x, y);

        bill[0] = Math.max(mathX, mathY);
        bill[1] = Math.min(mathX, mathY);
    }

}

