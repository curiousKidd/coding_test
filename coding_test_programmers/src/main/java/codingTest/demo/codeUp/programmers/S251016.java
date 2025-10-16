package codingTest.demo.codeUp.programmers;

public class S251016 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/389478

    public static void main(String[] args) {

        System.out.println(solution(14, 4, 7));  // 예: 적당한 케이스
        System.out.println(solution(8, 4, 8));   // 마지막 칸 테스트
        System.out.println(solution(10, 3, 3));  // 부분 채움 테스트
    }

    /**
     * n: 전체 상자 수
     * w: 한 줄에 놓이는 상자 수(열 개수)
     * num: 꺼낼 상자의 번호(1-based)
     *
     * @return 같은 열에서 num부터 끝까지 존재하는 상자 개수
     */
    public static int solution(int n, int w, int num) {
        int r = (num - 1) / w;        // num이 위치한 row
        int idxInRow = (num - 1) % w; // 그 행에서의 num 위치

        // 지그재그(짝수행 L->R, 홀수행 R->L)에 따른 열 c 계산
        int c = (r % 2 == 0) ? idxInRow : (w - 1 - idxInRow);

        // 전체 행 수와 마지막 행 정보
        int H = (n + w - 1) / w; // 총 행 수(ceil)
        int L = H - 1;           // 마지막 행 인덱스
        int m = n % w;           // 마지막 행에 실제 채워진 개수(0이면 꽉 참)

        // r .. L-1까지는 항상 꽉 찬 줄이므로 열 c에 반드시 1개씩 존재
        int full = Math.max(0, (H - 1) - r);

        // 마지막 행(L)에서 열 c가 채워졌는지 판정
        int lastRowHit;
        if (m == 0) {
            // 마지막 행도 가득 참
            lastRowHit = 1;
        } else {
            boolean lastRowLeftToRight = (L % 2 == 0);
            if (lastRowLeftToRight) {
                // 채워진 구간: 0 .. m-1
                lastRowHit = (c < m) ? 1 : 0;
            } else {
                // 채워진 구간: w-m .. w-1
                lastRowHit = (c >= w - m) ? 1 : 0;
            }
        }

        return full + lastRowHit;
    }
}
