package arrays.two_number_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public int[] twoNumberSum(int[] array, int targetSum) {
        if (array.length < 2) return new int[0];
        Map<Integer, Boolean> visitedNums = new HashMap<>();
        for (int num : array) {
            int expectNum = targetSum - num;
            if (!visitedNums.getOrDefault(expectNum, false)) {
                visitedNums.put(num, true);
                continue;
            }
            return new int[]{expectNum, num};
        }
        return new int[0];
    }
}
