package demo.codeUp.baekjoon.Y2025.cote_20251014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class baekjoon1874 {

    // 스택수열
    // https://www.acmicpc.net/problem/1874


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        solution(a, n);
    }

    public static void solution(int[] array, int n) throws IOException {
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder ops = new StringBuilder();

        int next = 1;
        for (int x : array) {
            // x를 만들기 위해 x까지 push
            while (next <= x) {
                stack.push(next++);
                ops.append("+\n");
            }
            // 이제 꼭대기가 x여야 pop 가능
            if (!stack.isEmpty() && stack.peek() == x) {
                stack.pop();
                ops.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.print(ops);
    }

}
