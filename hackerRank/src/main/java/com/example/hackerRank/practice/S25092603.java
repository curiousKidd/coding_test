package com.example.hackerRank.practice;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class S25092603 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = S25092603_Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

class S25092603_Result {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        /*
         * s 초콜릿의 상수
         * d 일자
         * m 월
         * m개의 연속된 초콜릿 상수의 합 = d
         * */
        int count = 0;
        int sum = 0;
        int first = 0;

        for (int i = 0; i < s.size(); i++) {
            sum += s.get(i);
            if (i > m - 1) {
                sum -= s.get(first);
                first++;
            }

            if (i >= m - 1 && sum == d) {
                count++;
            }
        }

        return count;
    }


}
