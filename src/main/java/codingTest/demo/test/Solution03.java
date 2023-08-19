package codingTest.demo.test;

public class Solution03 {

    public static void main(String[] args) {
        int[][] relationships = {{1,2}, {2,3}, {2,6}, {3,4}, {4,5}};
        int target = 2;
        int limit = 3;

//        int result = solution(relationships, target, limit);
//        System.out.println(result);
    }

    public String Solution(String[] Names) {
        String specialName = null;
        String longName = "";

        for (String name : Names) {
            boolean b = false;

            for (int i = 0; i < name.length(); i++) {
                if (!Character.isLetterOrDigit(name.charAt(i))) {
                    b = true;
                    break;
                }
            }

            if (b) {
                specialName = name;
                break;
            }

            if (name.length() > longName.length() && name.trim().length() > 0) {
                longName = name;
            }
        }

        if (specialName != null) {
            return specialName;
        }

        return longName;
    }
}
