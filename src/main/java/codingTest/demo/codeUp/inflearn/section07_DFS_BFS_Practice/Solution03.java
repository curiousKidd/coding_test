package codingTest.demo.codeUp.inflearn.section07_DFS_BFS_Practice;

public class Solution03 {

    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }

    public static void main(String[] args) {
        Solution03 T = new Solution03();
        System.out.println(T.DFS(5));
    }

}
