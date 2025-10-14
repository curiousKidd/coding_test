package demo.codeUp.baekjoon.cote_20230808;

import java.util.LinkedList;
import java.util.Queue;

public class DfsAndBfs {

    // https://www.acmicpc.net/problem/1260
    // DFS와 BFS
    // test
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {1, 3}, {1, 4}, {2, 4}, {3, 4}};
        int v = 1;
        int node = 4;
        int line = 5;
        boolean[] visited = new boolean[node + 1];

        int[][] arr = new int[node + 1][node + 1];

        for (int[] a : graph) {

            int x = a[0];
            int y = a[1];

            arr[x][y] = arr[y][x] = 1;

        }

        dfs(arr, v, node, visited);
        System.out.println();
        bfs(arr, v, node);
    }

    public static void dfs(int[][] arr, int v, int node, boolean[] visited) {

        System.out.print(v + " ");

        visited[v] = true;

        for (int i = 1; i <= node; i++) {
            if (arr[v][i] == 1 && !visited[i]) {
                dfs(arr, i, node, visited);
            }

        }
    }

    public static void bfs(int[][] arr, int v, int node) {
        StringBuilder sb = new StringBuilder();

        boolean[] visited = new boolean[node + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            sb.append(x).append(" ");

            for (int i = 1; i <= node; i++) {
                if (arr[x][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }

            }
        }

        System.out.println(sb.toString());

    }

}
