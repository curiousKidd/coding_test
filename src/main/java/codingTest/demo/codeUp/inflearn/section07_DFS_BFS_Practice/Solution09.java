package codingTest.demo.codeUp.inflearn.section07_DFS_BFS_Practice;

class Node_9 {
    int data;
    Node_9 lt, rt;

    public Node_9(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Solution09 {

    Node_9 root;

    public int DFS(int L, Node_9 root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

    public static void main(String args[]) {
        Solution09 tree = new Solution09();
        tree.root = new Node_9(1);
        tree.root.lt = new Node_9(2);
        tree.root.rt = new Node_9(3);
        tree.root.lt.lt = new Node_9(4);
        tree.root.lt.rt = new Node_9(5);
        System.out.println(tree.DFS(0, tree.root));
    }

}
