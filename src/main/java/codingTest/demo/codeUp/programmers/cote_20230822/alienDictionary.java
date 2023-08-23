package codingTest.demo.codeUp.programmers.cote_20230822;

public class alienDictionary {

    //https://school.programmers.co.kr/learn/courses/30/lessons/120869
    //외계어 사전

    public static void main(String[] args) {

        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};

        System.out.println("solution = " + solution(spell, dic));

    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        int check = 0;

        for (String s : dic) {
            check = 0;
            if (s.length() == spell.length) {
                for (String d : spell) {
                    if (!s.contains(d)) break;
                    if (s.indexOf(d) != s.lastIndexOf(d)) break;
                    check++;
                }
                if (check == spell.length) answer = 1;
            }
        }

        return answer;
    }
}
