package solution;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[][] company, int[] benefits, int k) {

        int [][] benefitArr = new int[company.length][2];
        for(int i = 0; i < benefits.length; i++) {
            benefitArr[i][0] = i + 1; // 회사 번호
            benefitArr[i][1] = benefits[i]; // 이익
        }

        // 1. 회사의 순위를 기준으로 오름차순 정렬
        Arrays.sort(company, (a, b) -> a[0] - b[0]);
        Arrays.sort(benefitArr, (a, b) -> a[0] - b[0]);
        int sum1 = 0;
        int ben1 = 0;
        for (int i = 0; i < k; i++) {
            sum1 += company[i][1];
            ben1 += benefitArr[i][1];
        }

        // 2. 회사의 이익을 기준으로 내림차순 정렬
        Arrays.sort(company, (a, b) -> b[1] - a[1]);
        Arrays.sort(benefitArr, (a, b) -> b[1] - a[1]);
        int sum2 = 0;
        int ben2 = 0;
        for (int i = 0; i < k; i++) {
            sum2 += company[i][1];
            ben2 += benefitArr[i][1];
        }
        return new int[]{Math.abs(sum1 - ben1), Math.abs(sum2 - ben2)};
    }
}