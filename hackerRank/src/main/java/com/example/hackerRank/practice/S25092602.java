package com.example.hackerRank.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class S25092602 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = S25092602_Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}

class S25092602_Result {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        // 최다 득점, 최소 득점을 얼마나 깼는지 확인
        int minScore = scores.get(0);
        int maxScore = scores.get(0);

        int minCount = 0, maxCount = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < minScore) {
                minScore = scores.get(i);
                minCount++;
            } else if (scores.get(i) > maxScore) {
                maxScore = scores.get(i);
                maxCount++;
            }

        }

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(maxCount);
        integers.add(minCount);

        return integers;

    }

}
