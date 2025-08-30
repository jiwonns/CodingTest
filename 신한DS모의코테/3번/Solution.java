package solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(String s, int n) {
        ArrayList[] arrayLists = new ArrayList[n];
        int remain = 0, remove = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arrayLists[i] = new ArrayList<Character>();
        }

        for (int i = 0; i < s.length(); i++) {
            arrayLists[i % n].add(s.charAt(i));
        }
        System.out.println(Arrays.toString(arrayLists));
        for (int i = 0; i < n; i++) {
            int len = arrayLists[i].size();
            int rm = 0;
            for (int j = 0; j < len - 1; j++) {
                if (arrayLists[i].get(j).equals(arrayLists[i].get(j + 1))) {
                    rm++;
                    sb.append(arrayLists[i].get(j));
                }
            }
            remain += len - rm;
            remove += rm;
        }
        System.out.println("제거된 문자 : " + sb);
        return new int[]{remain, remove};
    }
}