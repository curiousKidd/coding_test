package codingTest.demo.test;

import java.util.*;

public class Solution02 {

    public static void main(String[] args) {
        int[][] relationships = {{1,2}, {2,3}, {2,6}, {3,4}, {4,5}};
        int target = 2;
        int limit = 3;

        int result = solution(relationships, target, limit);
        System.out.println(result);
    }

    public static int solution(int[][] relationships, int target, int limit) {
        // 친구 관계를 그래프로 표현하기 위한 맵
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int[] relationship : relationships) {
            int person1 = relationship[0];
            int person2 = relationship[1];
            // 친구 관계를 양방향으로 추가
            graph.computeIfAbsent(person1, k -> new HashSet<>()).add(person2);
            graph.computeIfAbsent(person2, k -> new HashSet<>()).add(person1);
        }

        // BFS를 사용하여 최대 단계 이내의 친구를 탐색하고 보상을 계산
        int friendCount = 0;
        int rewardSum = 0;
        Set<Integer> visited = new HashSet<>();
        Set<Integer> currentLevel = new HashSet<>();
        Set<Integer> nextLevel = new HashSet<>();

        currentLevel.add(target);
        visited.add(target);

        int currentStep = 1;

        while (!currentLevel.isEmpty() && currentStep <= limit) {
            for (int person : currentLevel) {
                Set<Integer> friends = graph.get(person);
                for (int friend : friends) {
                    if (!visited.contains(friend)) {
                        visited.add(friend);
                        nextLevel.add(friend);
                        friendCount++;
                        if (currentStep == 1) {
                            rewardSum += 5;
                        } else {
                            rewardSum += 10;
                        }
                    }
                }
            }

            currentLevel.clear();
            currentLevel.addAll(nextLevel);
            nextLevel.clear();

            currentStep++;
        }

        return friendCount + rewardSum;
    }
}
