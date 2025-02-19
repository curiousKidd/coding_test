package codingTest.demo.codeUp.inflearn.section07_DFS_BFS_Practice;

import java.util.Scanner;

public class Solution01 {

    public void DFS(int i, int max) {
        if (i <= max) {
            System.out.printf("%d ", i);
            DFS(i += 1, max);
        }
    }

    public static void main(String[] args) {
        Solution01 T = new Solution01();

        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();

        T.DFS(1, max);
    }

}
