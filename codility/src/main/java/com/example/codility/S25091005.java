package com.example.codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S25091005 {
    public static void main(String[] args) {
        String[] s = {"abc", "abb", "cb", "a", "bbb"};
        int k = 2;

        System.out.println("solution() = " + solution(s, k));
    }


    public static int solution(String[] S, int K) {
        List<Set<Integer>> words = new ArrayList<>();

        // S > 사용된 워드의 갯수가 K 보다 작은애들 집합
        for (String word : S) {
            Set<Integer> set = new HashSet<>();

            for (char c : word.toCharArray()) {
                set.add(c - 'a');
            }

            if (set.size() <= K) words.add(set);
        }

        int[] best = {0};
        List<Integer> pick = new ArrayList<>();

        dfs(0, K, words, pick, best);

        return best[0];
    }

    private static void dfs(int start, int K, List<Set<Integer>> words, List<Integer> pick, int[] best) {
        if (pick.size() == K) {
            Set<Integer> set = new HashSet<>(pick);
            int count = 0;

            for (Set<Integer> w : words) {
                if (set.containsAll(w)) count++;
            }

            best[0] = Math.max(best[0], count);
            return;
        }

        for (int i = start; i < 10; i++) {
            pick.add(i);
            dfs(i + 1, K, words, pick, best);

            pick.removeLast();
        }

    }

}
