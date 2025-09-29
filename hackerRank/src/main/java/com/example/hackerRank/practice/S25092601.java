package com.example.hackerRank.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class S25092601 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = S25092601_Result.queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

class S25092601_Result {

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here
        /*
         * n 체스판 넓이
         * K 장애물 갯수
         * r_q, c_q 퀸 위치
         *
         * 퀸의 위치를 구해요
         * */

        // 8방향 기본 거리 (경계 기준)
        int up = n - r_q;
        int down = r_q - 1;
        int right = n - c_q;
        int left = c_q - 1;

        int ne = Math.min(n - r_q, n - c_q);
        int nw = Math.min(n - r_q, c_q - 1);
        int se = Math.min(r_q - 1, n - c_q);
        int sw = Math.min(r_q - 1, c_q - 1);

        for (List<Integer> ob : obstacles) {
            int r = ob.get(0), c = ob.get(1);

            // 같은 열
            if (c == c_q) {
                if (r > r_q) up = Math.min(up, r - r_q - 1);
                else if (r < r_q) down = Math.min(down, r_q - r - 1);
            }
            // 같은 행
            else if (r == r_q) {
                if (c > c_q) right = Math.min(right, c - c_q - 1);
                else if (c < c_q) left = Math.min(left, c_q - c - 1);
            }
            // 대각선
            else if (Math.abs(r - r_q) == Math.abs(c - c_q)) {
                int dist = Math.abs(r - r_q) - 1;
                if (r > r_q && c > c_q) ne = Math.min(ne, dist);
                else if (r > r_q && c < c_q) nw = Math.min(nw, dist);
                else if (r < r_q && c > c_q) se = Math.min(se, dist);
                else sw = Math.min(sw, dist);
            }
        }

        return up + down + left + right + ne + nw + se + sw;
    }

}
