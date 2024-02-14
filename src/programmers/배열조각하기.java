package programmers;

import java.util.Arrays;

public class 배열조각하기 {
    class Solution {
        public int[] solution(int[] arr, int[] query) {

            for (int i = 0; i < query.length; i++) {
                if (i % 2 == 0) {
                    arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
                    return arr;
                } else {
                    arr = Arrays.copyOfRange(arr, query[i], arr.length);
                    return arr;
                }
            }
            return arr;
        }
    }
}
