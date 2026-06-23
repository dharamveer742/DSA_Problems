package _7prefixSum;

import java.util.HashMap;

public class subArraySumsDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        // Base case
        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            int rem = sum % k;

            // Handle negative remainder
            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
