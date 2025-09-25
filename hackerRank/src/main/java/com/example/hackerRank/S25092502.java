package com.example.hackerRank;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

public class S25092502 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = S25092502_Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

class S25092502_Result {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here

        /*
         * S 의 부분원소 에서 2개씩 더했을때, K의 배수가 되지 않아야한다.
         * k 의 배수가 되지 않는 부분원소들의 집합을 만들어내자
         *
         * */
        int maxLength = 0;

        // 나머지 계산
        int[] cnt = new int[k];

        for (int i : s) cnt[i % k]++;

        // 나머지 0은 최대 1개
        if (cnt[0] > 0) maxLength += 1;

        // 1..k/2 쌍 처리
        for (int r = 1; r <= k / 2; r++) {
            if (r == k - r) {
                // k가 짝수이고 r == k/2인 경우: 최대 1개
                if (cnt[r] > 0) maxLength += 1;
            } else {
                maxLength += Math.max(cnt[r], cnt[k - r]);
            }
        }

        return maxLength;
    }

}
