package _7prefixSum;

import java.util.HashMap;

public class subArraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        // Important: base case
        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            // Check if (currentSum - k) exists
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store current sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
