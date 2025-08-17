package demo.codeUp.baekjoon;

import java.util.Arrays;

public class Baekjoon {

    public void sugar() {
        int n = 10;

        int five = n / 5;
        int three = (n % 5) / 3;
        int other = (n % 5) % 3;

        if (n == 4 || n == 7) {
            System.out.println(-1);
        } else {
            if (other == 1) {
                five = five - 1;
                three = three + 2;
            } else if (other == 2) {
                five = five - 2;
                three = three + 4;
            }
            System.out.println(five + three);
        }
    }

    public void atm() {
        int n = 5;
        int[] arrayInt = {3, 1, 4, 3, 2};

        Arrays.sort(arrayInt);

        int returnInt = 0;
        int lengthInt = n;

        for (int value : arrayInt) {
            returnInt += (value * lengthInt);
            lengthInt -= 1;
        }

        System.out.println(returnInt);
    }

    public void coin() {
        int n = 10;
        int k = 4201;
        int[] a = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};

        int coinCount = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (k == 0) break;
            if (k >= a[i]) {
                coinCount += k / a[i];
                k = k % a[i];
            }
        }
        System.out.println(coinCount);
    }

}
