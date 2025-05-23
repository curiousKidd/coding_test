package codingTest.demo.codeUp.programmers.code_2024.cote_20240719;

public class Solution01 {
    int[][] min, max;

    public int solution(String arr[]) {
        int size = arr.length / 2 + 1;
        min = new int[size][size];
        max = new int[size][size];

        int[] list = new int[size];

        for (int i = 0; i < arr.length; i += 2) {
            int num = Integer.parseInt(arr[i]);
            if (i == 0) {
                list[i / 2] = num;
            } else {
                list[i / 2] = arr[i - 1].equals("+") ? num : -num;
            }
        }

        for (int i = size - 1; i >= 0; i--) {
            for (int j = i; j < size; j++) {
                if (i == j) {
                    min[i][j] = list[i];
                    max[i][j] = list[i];
                } else {
                    min[i][j] = Integer.MAX_VALUE;
                    max[i][j] = Integer.MIN_VALUE;

                    for (int k = i; k < j; k++) {
                        boolean value = k == i ? true : false;
                        func(min[i][k], min[k + 1][j], i, j, value);
                        func(min[i][k], max[k + 1][j], i, j, value);
                        func(max[i][k], min[k + 1][j], i, j, value);
                        func(max[i][k], max[k + 1][j], i, j, value);
                    }
                }
            }
        }
        return max[0][size - 1];
    }

    public void func(int a, int b, int x, int y, boolean value) {
        if (value && a < 0) {
            min[x][y] = Math.min(min[x][y], Math.min(a - b, a + b));
            max[x][y] = Math.max(max[x][y], Math.max(a - b, a + b));
        } else {
            min[x][y] = Math.min(min[x][y], a + b);
            max[x][y] = Math.max(max[x][y], a + b);
        }
    }
}
