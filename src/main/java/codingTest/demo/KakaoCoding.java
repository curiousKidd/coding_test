package codingTest.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KakaoCoding {

    public void date() {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        LocalDate localToday = LocalDate.parse(today, formatter);

        int[] answer = {};

        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<Integer, Integer> retrunMap = new HashMap<Integer, Integer>();

        for (String term : terms) {
            String[] s = term.split(" ");
            map.put(s[0], Integer.parseInt(s[1]));
        }

        String answerText = "";
        int i = 1;
        for (String privacy : privacies) {
            String[] s = privacy.split(" ");
            LocalDate localDate = LocalDate.parse(s[0], formatter);
            LocalDate localDatePlus = localDate.plusMonths(map.get(s[1])).minusDays(1);

            if (localToday.isAfter(localDatePlus)) {
                retrunMap.put(i, i);
                i++;
            }
        }

        answer = new int[i - 1];
        i = 0;
        for (Integer key : retrunMap.keySet()) {
            System.out.println(retrunMap.get(key));
            answer[i] = retrunMap.get(key);
            i++;
        }

        System.out.println(Arrays.toString(answer));

    }

    public void send() {
        int cap = 2;
        int n = 7;
        //        int[] deliveries = {1, 0, 3, 1, 2};
        int[] deliveries = {1, 0, 2, 0, 1, 0, 2};
        int[] pickups = {0, 3, 0, 4, 0};

        int answer = 0;
        int dSum = 0;
        int pSum = 0;

        for (int i = n - 1; i > 0; i--) {

            if (dSum == 0 && answer == 0) {
                answer += (i + 1) * 2;
            }

            if (dSum < cap) {
                if (dSum + deliveries[i] < cap) {
                    dSum += deliveries[i];
                } else {
                    dSum = 0;
                    answer += (i + 1) * 2;
                }
            }

        }

        System.out.println(answer);

    }

}
