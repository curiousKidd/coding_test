package codingTest.demo.codeUp.inflearn.section08;

import java.util.Scanner;

public class Solution07 {

    int[][] dy = new int[35][35];

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }

    public static void main(String[] args) {
        Solution07 T = new Solution07();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n, r));
    }

}
