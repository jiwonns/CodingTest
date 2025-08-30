import solution.Solution;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int [][] company = {{1,50},{3,500},{2, 150},{4, 200}};
        int [] benefits = {100, 200, 300, 500};
        // 답 : 700 - 600 = 100, 850 - 1000 = 150
        // 100, 150
        System.out.println(Arrays.toString(s.solution(company, benefits, 3)));
    }
}