package demo.codeUp.baekjoon.cote_20230904;

public class Solution {

    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int T = scanner.nextInt(); // 테스트 케이스 개수
        //
        //        for (int t = 0; t < T; t++) {
        //            int M = scanner.nextInt(); // M: 총 음식 가짓수
        //            int N = scanner.nextInt(); // N: 끼니마다 제공되는 음식 가짓수
        //
        //            int[] foodNumbers = new int[N];
        //            for (int i = 0; i < N; i++) {
        //                foodNumbers[i] = scanner.nextInt();
        //            }
        //
        //            int combinations = calculateCombinations(M, N, foodNumbers);
        //            System.out.println(combinations);
        //        }

        test();
    }

    public static int calculateCombinations(int M, int N, int[] foodNumbers) {
        int a = 1;

        for (int i = 0; i < foodNumbers.length - 1; i++) {
            a *= foodNumbers[i + 1] - foodNumbers[i];
        }

        return a / foodNumbers.length - 1;
    }

    public static void test() {
        // Test Case 1
        int result1 = calculateCombinations(6, 3, new int[]{1, 3, 5});
        System.out.println(result1); // Expected: 2

        // Test Case 2
        int result2 = calculateCombinations(16, 4, new int[]{1, 3, 9, 11});
        System.out.println(result2); // Expected: 8
    }

}
