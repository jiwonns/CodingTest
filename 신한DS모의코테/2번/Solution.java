package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] arr) {
        int answer = Integer.MAX_VALUE;
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            if (map.containsKey(n)) {
                answer = n + 1;
                break;
            }
            map.put(n, 1);
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            if (!map.containsKey(i)) {
                answer = Math.min(answer, i);
            }
        }

        if (answer == arr.length + 1) {
            return -1;
        }
        return answer;
    }
}