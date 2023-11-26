package codingTest.demo.codeUp.inflearn.section07_DFS_BFS_Practice;

import java.util.LinkedList;
import java.util.Queue;

class Node_8 {
    int data;
    Node_8 lt, rt;

    public Node_8(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Solution08 {
    Node_8 root;

    public void BFS(Node_8 root) {
        Queue<Node_8> Q = new LinkedList<>();
        Q.add(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node_8 cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) Q.add(cur.lt);
                if (cur.rt != null) Q.add(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Solution08 tree = new Solution08();
        tree.root = new Node_8(1);
        tree.root.lt = new Node_8(2);
        tree.root.rt = new Node_8(3);
        tree.root.lt.lt = new Node_8(4);
        tree.root.lt.rt = new Node_8(5);
        tree.root.rt.lt = new Node_8(6);
        tree.root.rt.rt = new Node_8(7);
        tree.BFS(tree.root);
    }
}
