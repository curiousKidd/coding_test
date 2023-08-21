package codingTest.demo.codeUp.inflearn.section01_String;

import java.util.Scanner;

public class findText {

    // Computercoole

    public static void main(String[] args) {
        findText T = new findText();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }
        return answer;
    }

}
