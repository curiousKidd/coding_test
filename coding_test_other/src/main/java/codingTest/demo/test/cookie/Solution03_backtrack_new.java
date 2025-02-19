package codingTest.demo.test.cookie;

public class Solution03_backtrack_new {

    static int maxJellyCount;

    public static int solution(String[] pouches) {
        maxJellyCount = 0;
        int r = 1;  // 시작하는 조합의 크기
        generateCombinations(pouches, new String[r], 0, 0, r);
        return maxJellyCount;
    }

    private static void generateCombinations(String[] pouches, String[] selectedPouches, int selectedIndex, int currentIndex, int r) {
        if (selectedIndex == r) {
            int[] jellyCounts = new int[5];
            int totalJellyCount = 0;

            for (String pouch : selectedPouches) {
                for (int i = 0; i < pouch.length(); i++) {
                    char jellyType = pouch.charAt(i);
                    jellyCounts[jellyType - 'a']++;
                    totalJellyCount++;
                }
            }

            int maxCount = 0;
            for (int count : jellyCounts) {
                maxCount = Math.max(maxCount, count);
            }

            if (maxCount > totalJellyCount / 2) {
                maxJellyCount = Math.max(maxJellyCount, selectedPouches.length);
            }
            return;
        }

        if (currentIndex == pouches.length) {
            return;
        }

        generateCombinations(pouches, selectedPouches, selectedIndex, currentIndex + 1, r);

        selectedPouches[selectedIndex] = pouches[currentIndex];
        generateCombinations(pouches, selectedPouches, selectedIndex + 1, currentIndex + 1, r);
        selectedPouches[selectedIndex] = null;
    }

}
