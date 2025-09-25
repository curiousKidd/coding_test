package com.example.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class S25092501 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        S25092501_Result.extraLongFactorials(n);

        bufferedReader.close();
    }

}

class S25092501_Result {

    public static void extraLongFactorials(int n) {
        // Write your code here

        BigInteger factorialBig = new BigInteger("1");

        while (n >= 1) {
            factorialBig = factorialBig.multiply(new BigInteger("" + n));
            n--;
        }

        System.out.println(factorialBig);
    }

}
