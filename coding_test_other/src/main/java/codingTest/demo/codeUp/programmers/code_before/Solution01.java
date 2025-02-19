package codingTest.demo.codeUp.programmers.code_before;

import java.util.Stack;

public class Solution01 {

    // 카카오 2019 인형뽑기
    public void solution() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int row = board.length - 1;
        int move = 0;

        int returnValue = 0;

        Stack<Integer> stack = new Stack<>();

        for (int j : moves) {
            move = j - 1;
            for (int i = 0; i <= row; i++) {
                if (board[i][move] != 0) {
                    if (!stack.empty()) {
                        System.out.printf("board = %d, %d, %d", i, move, board[i][move]);
                        if (stack.peek() == board[i][move]) {
                            stack.pop();
                            returnValue += 1;
                        } else {
                            stack.push(board[i][move]);
                        }
                        ;
                    } else {
                        stack.push(board[i][move]);
                    }
                    ;
                    System.out.println(stack);
                    board[i][move] = 0;
                    break;

                }
            }
        }

        System.out.println(returnValue);

    }

}
