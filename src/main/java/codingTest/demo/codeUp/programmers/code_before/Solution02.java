package codingTest.demo.codeUp.programmers.code_before;

public class Solution02 {

    // 카카오 2020 인턴쉽
    public void solution() {
        String answer = "";

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        int[] leftHand = {3, 0};
        int[] rightHand = {3, 2};

        int[][] call = {
                {3, 1},
                {0, 0}, {0, 1}, {0, 2},
                {1, 0}, {1, 1}, {1, 2},
                {2, 0}, {2, 1}, {2, 2}
        };

        for (int number : numbers) {
            System.out.println("number = " + number);
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftHand = call[number];
            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightHand = call[number];
            } else {
                int value = call[number][0] + call[number][1];
                int leftFirstValue = leftHand[0] - call[number][0];
                int leftValue = leftHand[0] + leftHand[1] - value;
                int rightFirstValue = rightHand[0] - call[number][0];
                int rightValue = rightHand[0] + rightHand[1] - value;

                if (Math.abs(leftValue) > Math.abs(rightValue)) {
                    answer += "L";
                    leftHand = call[number];
                } else if (Math.abs(leftValue) < Math.abs(rightValue)) {
                    answer += "R";
                    rightHand = call[number];
                } else {
                    if (Math.abs(leftFirstValue) < Math.abs(rightFirstValue)) {
                        answer += "L";
                        leftHand = call[number];
                    } else if (Math.abs(leftFirstValue) > Math.abs(rightFirstValue)) {
                        answer += "R";
                        rightHand = call[number];
                    } else {
                        if (hand == "left") {
                            answer += "L";
                            leftHand = call[number];
                        } else {
                            answer += "R";
                            rightHand = call[number];
                        }
                    }
                }

            }
            ;

        }

        System.out.println(answer);
    }

}
