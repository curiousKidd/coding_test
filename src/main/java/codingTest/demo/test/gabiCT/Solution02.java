package codingTest.demo.test.gabiCT;

public class Solution02 {

    public static void main(String[] args) {
        int n = 3; // n은 줄과 열의 개수입니다. 예시에서는 3으로 주어졌습니다.
        int result = solution(n);
        System.out.println("서로 다른 네 점을 이어 만들 수 있는 정사각형의 개수는 " + result + "개 입니다.");
    }


    public static int solution(int n) {
        int answer = 0;


        int[] a = {0, 0};
        int[] b = {0, 0};
        int[] c = {0, 0};
        int[] d = {0, 0};


//        for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = -1;
                while (b[1] < n) {
                    int ab = Math.abs((a[0] + a[1]) - (b[0] + b[1]));
                    int ac = Math.abs((a[0] + a[1]) - (c[0] + c[1]));
                    int db = Math.abs((d[0] + d[1]) - (b[0] + b[1]));
                    int dc = Math.abs((d[0] + d[1]) - (c[0] + c[1]));

                    System.out.println("ab = " + ab);
                    System.out.println("ac = " + ac);
                    System.out.println("db = " + db);
                    System.out.println("dc = " + dc);
                    if ((ab == ac) == (db == dc)) {
                        count++;
                        b[1] += i + 1;
                        d[1] += i + 1;
                        c[0] += i + 1;
                        d[0] += i + 1;

                        System.out.println("count = " + count);
                    }
                    if (b[1] == n) {
                        a = new int[]{i, j};
                        b = new int[]{i, j};
                        c = new int[]{i, j};
                        d = new int[]{i, j};
                        break;
                    }
                }

                answer += count;
            }
        }
//        }

        return answer;
    }
}
