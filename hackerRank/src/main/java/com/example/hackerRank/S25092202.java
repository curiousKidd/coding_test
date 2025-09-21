package com.example.hackerRank;

import java.io.*;

public class S25092202 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = S25092202_Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class S25092202_Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        /*
         * x1 캥거루
         * v1 캥거루 속도
         * */

        if (v1 <= v2) {
            return "NO";
        }

        int cnt = 1;
        while (x1 < x2) {
            x1 += v1 * cnt;
            x2 += v2 * cnt;

            if (x1 == x2) {
                return "YES";
            }
        }


        return "NO";

    }
}
