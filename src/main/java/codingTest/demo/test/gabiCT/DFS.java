package codingTest.demo.test.gabiCT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DFS {

    public static void main(String[] args) {
        int n1 = 4;
        int[][] nationality1 = {{1, 2}, {2, 3}, {1, 3}};
        System.out.println(solution(n1, nationality1)); // 3

        int n2 = 5;
        int[][] nationality2 = {{1, 2}, {2, 3}};
        System.out.println(solution(n2, nationality2)); // 7
    }

    public static int solution(int n, int[][] nationality) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();

        // 그래프 초기화
        for (int i = 1; i <= n; i++) {
            graph.put(i, new HashSet<>());
        }

        // 같은 국적을 가진 학생 쌍을 그래프에 추가
        for (int[] pair : nationality) {
            int a = pair[0];
            int b = pair[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int count = 0;

        // 대표 두 명을 뽑는 방법 계산
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                boolean[] visited = new boolean[n + 1];
                int groupSize = dfs(i, j, graph, visited);

                if (groupSize == n - 2) {
                    count++;
                }
            }
        }

        return count;
    }

    // 깊이 우선 탐색 (DFS)
    private static int dfs(int current, int target, Map<Integer, Set<Integer>> graph, boolean[] visited) {
        visited[current] = true;
        int size = 1;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor] && neighbor != target) {
                size += dfs(neighbor, target, graph, visited);
            }
        }

        return size;
    }

}
