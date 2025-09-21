package com.example.hackerRank;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class S25092203 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = S25092203_Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class S25092203_Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        /*
         * a 배열의 값을 모두 인수로 가지면서 == a 배열 최소 공배수
         * b 배열들의 인수가 될 수 있는 == 최대 공약수가 아닐수도 있다...?
         * */
        // Write your code here

        int lcm = lcmOfList(a);
        int gcd = gcdList(b);
//
//        // lcm의 배수를 필터링해서 count
        return (int) IntStream.iterate(lcm, x -> x <= gcd, x -> x + lcm)
                .filter(x -> gcd % x == 0)
                .count();
    }


    // 최대 공약수
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 최소 공배수
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 최대 공약수
    public static int gcdList(List<Integer> a) {
        return a.stream().reduce((x, y) -> gcd(x, y)).orElse(1);
    }

    public static int lcmOfList(List<Integer> b) {
        return b.stream().reduce((x, y) -> lcm(x, y)).orElse(1);
    }
}
