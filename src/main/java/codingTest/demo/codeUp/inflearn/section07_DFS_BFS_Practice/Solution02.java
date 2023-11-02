package codingTest.demo.codeUp.inflearn.section07_DFS_BFS_Practice;

public class Solution02 {

    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public void solution(int n) {
        DFS(n);
    }

    public static void main(String[] args) {
        Solution02 T = new Solution02();
        T.solution(11);
        //System.out.println(T.solution(3));
    }

}
