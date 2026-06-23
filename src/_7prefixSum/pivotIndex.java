package _7prefixSum;

public class pivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;

        // Step 1: calculate total sum
        for (int num : nums) {
            total += num;
        }

        int runningSum = 0;

        // Step 2: find pivot index
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (runningSum -nums[i] == total - runningSum) {
                return i;
            }

        }

        return -1;
    }
}
