package codingTest.demo.codeUp.programmers.code_before;

import java.util.Arrays;

public class Solution07 {

    public static void main(String[] args) {

        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] reportList = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        Solution07 sol = new Solution07();

        int[] result = sol.solution(idList, reportList, k);

        System.out.println("result = " + Arrays.toString(result));

    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {id_list.length};

        return answer;
    }
}
