package codingTest.demo.test.gabiCT;

import java.util.Arrays;

public class Solution01 {

    public static void main(String[] args) {

        String[] a = {"abab", "bbaa", "bababa", "bbbabababbbaa"};
//        String[] a = {"bbbabababbbaa"};

        boolean[] test = solution(a);

        System.out.println("test = " + Arrays.toString(test));
//        test222();
    }

    public static boolean[] solution(String[] a) {
        boolean[] answer = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            String s = a[i];

            char[] charArray = s.toCharArray();

            int start = 0;
            int end = s.length() - 1;

            int count = 0;

            System.out.println("i = " + i);

            while (true) {
                if (end < start) {
                    answer[i] = false;
                    break;
                }

                if (start == end) {
                    System.out.println(1);
                    answer[i] = true;
                    break;
                }

                if (charArray[start] == 'a' && charArray[end] == 'a' && count != 0) {
                    String x = s.substring(start, end + 1);
                    int k = x.length() - x.replace("a", "").length();
                    if (count != k) {
                        System.out.println(2);
                        answer[i] = false;
                        break;
                    }
                    count = 0;
                }

                if (charArray[start] == 'a') start++;
                if (charArray[end] == 'a') end--;

                if (charArray[start] == 'b' && charArray[end] == 'b') {

                    System.out.println("bbbbbbb");
                    count++;
                    start++;
                    end--;
//                    } else {
//                        System.out.println(3);
//                        answer[i] = false;
//                        break;
//                    }
                }
            }

        }
        return answer;
    }


    public static boolean[] test(String[] a) {

        boolean[] answer = new boolean[a.length];

        System.out.println("a.length = " + a.length);

        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            System.out.println("s = " + s);
            answer[i] = testcase(s);
            System.out.println("s = " + s);
        }

        return answer;
    }

    public static boolean testcase(String s) {
        int start = s.indexOf("b");
        int end = s.lastIndexOf("b");

        if (start < 0) {
            return true;
        } else if (start == end) {
            return false;
        }

        String target = s.substring(start, end + 1);

        for (int j = 0; j < target.length() / 2; j++) {
            if (target.charAt(j) == 'b' && target.charAt(j + 1) == 'a') {
                int count = target.length() - target.replace("a", "").length();

                if (count != j + 1) {
                    return false;
                }
            } else if (target.charAt(j) == 'a') {
                return testcase(target.substring(j, target.length() - j));
            }

        }
        return false;
    }
}
