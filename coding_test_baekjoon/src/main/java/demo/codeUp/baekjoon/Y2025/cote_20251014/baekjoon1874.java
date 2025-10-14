package demo.codeUp.baekjoon.Y2025.cote_20251014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

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
        ArrayList<Character> result = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        // array 위치
        int now = 0;

        /**
         * 1- n 까지 숫자
         */

        // push 변수
        int i = 1;

        while (now < n) {
            result.add('+');
            stack.push(i);
            if (array[now] == stack.peek()) {
                result.add('-');
                stack.pop();
                now++;
                i++;
            } else if (array[now] < stack.peek()) {
                System.out.println("i = " + i);
                System.out.println("array = " + array[now]);
                System.out.println("stack = " + stack.peek());
                System.out.println("NO");
                break;
            } else {
                i++;
            }
        }

        result.stream().forEach(System.out::println);

    }

}
