package codingTest.demo.codeUp.programmers.cote_2025.cote_2510;

public class S25102102 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/250137

    public static void main(String[] args) {
        int[] bandage = {5, 1, 5};
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(solution(bandage, 30, attacks));

        int[] bandage2 = {3, 2, 7};
        int[][] attacks2 = {{1, 15}, {5, 16}, {8, 6}};
        System.out.println(solution(bandage2, 20, attacks2));

        int[] bandage3 = {1, 1, 1};
        int[][] attacks3 = {{1, 2}, {3, 2}};
        System.out.println(solution(bandage3, 5, attacks3));
    }

    /**
     * @param bandage : 붕대 감기 기술의 시전 시간, 1초당 회복량, 추가 회복량을 담은 1차원 정수 배열
     * @param health  : 최대 체력을 의미하는 정수
     * @param attacks : 몬스터의 공격 시간과 피해량을 담은 2차원 정수 배열
     * @return : 만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return 해주세요.
     */
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];     // 시전 시간
        int x = bandage[1];     // 초당 회복량
        int y = bandage[2];     // 추가 회복량

        int nowHealth = health; // 현재 체력
        int prevTime = 0;       // 이전 공격 시각
        for (int[] attack : attacks) {
            // attack[0] : 공격 시간
            // attack[1] : 데미지

            if (nowHealth < health) {
                int diff = attack[0] - prevTime - 1;
                nowHealth += diff * x;
                if (diff >= t) nowHealth += y * (diff / t);

                nowHealth = Math.min(nowHealth, health);
            }

            prevTime = attack[0];
            nowHealth -= attack[1];

            if (nowHealth <= 0) return -1;
        }

        return nowHealth;
    }

}

