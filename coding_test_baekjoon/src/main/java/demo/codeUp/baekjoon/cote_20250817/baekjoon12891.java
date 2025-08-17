package demo.codeUp.baekjoon.cote_20250817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon12891 {

    // DNA 비밀번호
    // https://www.acmicpc.net/problem/12891


    static int[] passwordRegex = new int[4];   // 체크할 비밀번호 규칙
    static int[] myPassword = new int[4];   // 나의 비밀번호
    static int checkSecret = 0;        // 만족한 비밀번호 규칙

    public static void main(String[] args) throws NumberFormatException, IOException {
        int count = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int s = Integer.parseInt(st.nextToken());       // 주어진 텍스트 문자열 길이
        int p = Integer.parseInt(st.nextToken());       // 사용할 텍스트 문자열 길이

        String password = bf.readLine();            // 주어진 텍스트
        char[] chars = password.toCharArray();

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            // 순서대로 A C G T
            passwordRegex[i] = Integer.parseInt(st.nextToken());
            if (passwordRegex[i] == 0)
                // 0일 경우에는 만족한것으로 치부
                checkSecret++;
        }


        System.out.println(count);
        bf.close();
    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                passwordRegex[0]++;
                if (passwordRegex[0] == myPassword[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                passwordRegex[1]++;
                if (passwordRegex[1] == myPassword[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                passwordRegex[2]++;
                if (passwordRegex[2] == myPassword[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                passwordRegex[3]++;
                if (passwordRegex[3] == myPassword[3]) {
                    checkSecret++;
                }
                break;
        }

    }

}
