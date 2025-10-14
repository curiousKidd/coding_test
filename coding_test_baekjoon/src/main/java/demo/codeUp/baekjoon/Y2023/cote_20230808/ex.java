package demo.codeUp.baekjoon.cote_20230808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex {

    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;

    static int node, line, start;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //        arr = new int[node + 1][node + 1];
        check = new boolean[5];

        //        for (int i = 0; i < line; i++) {
        //            StringTokenizer str = new StringTokenizer(br.readLine());
        //
        //            int a = Integer.parseInt(str.nextToken());
        //            int b = Integer.parseInt(str.nextToken());
        //
        //            arr[a][b] = arr[b][a] = 1;
        //        }

        arr = new int[][]{{}, {1, 2}, {1, 3}, {1, 4}, {2, 4}, {3, 4}};
        //sb.append("\n");
        dfs(1);
        sb.append("\n");

    }

    public static void dfs(int start) {

        check[start] = true;
        sb.append(start + " ");

        for (int i = 0; i <= node; i++) {
            if (arr[start][i] == 1 && !check[i])
                dfs(i);
        }

    }
}
