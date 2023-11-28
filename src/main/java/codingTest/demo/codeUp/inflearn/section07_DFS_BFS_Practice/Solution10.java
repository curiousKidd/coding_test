package codingTest.demo.codeUp.inflearn.section07_DFS_BFS_Practice;

import java.util.LinkedList;
import java.util.Queue;

class Node_10 {
    int data;
    Node_10 lt, rt;

    public Node_10(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Solution10 {


    Node_10 root;

    public int BFS(Node_10 root) {
        Queue<Node_10> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node_10 cur = Q.poll();
                if (cur.lt == null && cur.rt == null) return L;
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String args[]) {
        Solution10 tree = new Solution10();
        tree.root = new Node_10(1);
        tree.root.lt = new Node_10(2);
        tree.root.rt = new Node_10(3);
        tree.root.lt.lt = new Node_10(4);
        tree.root.lt.rt = new Node_10(5);
        System.out.println(tree.BFS(tree.root));
    }

}
