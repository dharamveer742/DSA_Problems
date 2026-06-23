package _7prefixSum;

public class BinarySubArraysWithSum {

    // if array contains 0 and non negative elements ?

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);

    }
    private int atMost(int[] nums, int goal) {

        int windowStart = 0;
        int windowEnd =0;
        int sum = 0;
        int count = 0;

        while(windowEnd<nums.length){
            sum += nums[windowEnd];

            while (sum > goal && windowStart<=windowEnd) {
                sum -= nums[windowStart];
                windowStart++;
            }
            count += (windowEnd - windowStart + 1);
            windowEnd++;
        }

        return count;
    }
}
