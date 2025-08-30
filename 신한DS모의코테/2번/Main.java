import solution.Solution;

import java.util.Arrays;

public class Main {

    // n-1 개
    // n 번째 걸리면 -1
    // 가장 작은 수

    // 정렬되어 있었는지 아닌지 까먹음
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1, 3, 3, 4}; // 2
        int[] arr2 = {1, 2}; // -1
        int[] arr3 = {1,2,2}; // 3
        int[] arr4 = {1,2,3,4,5}; // -1
        int[] arr5 = {1,4,4,5}; // 2
        int[] arr6 = {5,4,4,1}; // 2

        System.out.println(s.solution(arr1));
        System.out.println(s.solution(arr2));
        System.out.println(s.solution(arr3));
        System.out.println(s.solution(arr4));
        System.out.println(s.solution(arr5));
        System.out.println(s.solution(arr6));
    }
}