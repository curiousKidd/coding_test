package codingTest.demo.codeUp.programmers.cote_2025.cote_other.cote_250429;

import java.util.Arrays;

public class Solution250429 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42577
    // 전화번호 목록

    public static void main(String[] args) {

        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};

        System.out.println(solution2(phone_book1));
        System.out.println(solution2(phone_book2));
        System.out.println(solution2(phone_book3));
    }

    public static boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
            String number = phone_book[i];
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].contains(number)) {
                    return false;
                }
            }

        }

        return true;
    }

    public static boolean solution2(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

}
