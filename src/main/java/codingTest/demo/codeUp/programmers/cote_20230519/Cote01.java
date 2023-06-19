package codingTest.demo.codeUp.programmers.cote_20230519;

public class Cote01 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/42860
    // 탐욕법(Greedy) > 조이스틱

    public static void main(String[] args) {

        Cote01 cote01 = new Cote01();

        String name = "JAZ";

        System.out.println("cote01 = " + cote01.solution(name));
    }

    public int solution(String name) {
        int answer = -1;

        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (c <= 'N') {
                answer++;
                answer += c - 'A';
            } else {
                answer++;
                answer += ('Z' - c) + 1;
            }
        }

        return answer;
    }

    // ex
    public int solution2(String name) {
        int answer = 0;
        int length = name.length();

        int index; // 다음 값들을 확인할 때 사용
        int move = length - 1; // 좌우 움직임 수를 체크

        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            // 연속되는 A 갯수 확인
            while (index < length && name.charAt(index) == 'A') {
                index++;
            }

            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            //            move = Math.min(move, i * 2 + length - index);
            // 2022년 이전 테스트 케이스만 확인하면 여기까지해도 정답처리가 되기 때문에, 이전 정답들에는 여기까지만 정리되어 있지만,

            // BBBBAAAAAAAB 와 같이, 처음부터 뒷부분을 먼저 입력하는 것이 더 빠른 경우까지 고려하려면 아래의 코드가 필요합니다.
            // * 2 를 해주는 이유는 뒤로 돌아갈 경우 돌아간 부분은 두번 반복해야하기 떄문
            // length - index = 뒷부분부터 시작할때 두번 거쳐가는 글자의 length
            move = Math.min(move, (length - index) * 2 + i);
        }
        return answer + move;
    }
}
