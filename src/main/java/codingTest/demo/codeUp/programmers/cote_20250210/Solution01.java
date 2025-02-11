package codingTest.demo.codeUp.programmers.cote_20250210;

public class Solution01 {

    //    sizes	                                            result
    //    [[60, 50], [30, 70], [60, 30], [80, 40]]	        4000
    //    [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	    120
    //    [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	    133

    public static void main(String[] args) {
        //        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        //        int[][] sizes = {{2, 6}, {1, 11}, {3, 7}};
        //        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        Solution01 solution01 = new Solution01();
        int solution = solution01.solution(sizes);
        System.out.println("solution = " + solution);
    }

    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                w = Math.max(w, size[0]);
                h = Math.max(h, size[1]);
            } else {
                w = Math.max(w, size[1]);
                h = Math.max(h, size[0]);
            }
        }

        System.out.println("w = " + w);
        System.out.println("h = " + h);

        return w * h;
    }
}
