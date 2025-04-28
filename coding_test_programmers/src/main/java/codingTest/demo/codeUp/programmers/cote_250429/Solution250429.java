package codingTest.demo.codeUp.programmers.cote_250429;

public class Solution250429 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42577
    // 전화번호 목록

    public static void main(String[] args) {

        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};

        System.out.println(solution(phone_book1));
        System.out.println(solution(phone_book2));
        System.out.println(solution(phone_book3));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for (String s : phone_book) {
            System.out.println("s = " + s);
        }

        return answer;
    }

}
