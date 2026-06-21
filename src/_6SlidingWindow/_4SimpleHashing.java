package _6SlidingWindow;

import java.util.HashMap;

public class _4SimpleHashing {

   // Maximum Sum of Distinct Subarrays With Length K

    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum =0;
        long ans = 0;
        int windowStart=0;
        int windowEnd=0;
        while(windowEnd<nums.length){
            sum = sum+nums[windowEnd];
            map.put(nums[windowEnd],map.getOrDefault(nums[windowEnd],0)+1);
            if(windowEnd-windowStart+1==k){
                if(map.size()==k){
                    ans = Math.max(ans,sum);
                }
                sum = sum-nums[windowStart];
                if(map.containsKey(nums[windowStart])){
                    map.put(nums[windowStart],map.get(nums[windowStart])-1);
                    if(map.get(nums[windowStart])==0){
                        map.remove(nums[windowStart]);
                    }
                }
                windowStart++;
            }
            windowEnd++;

        }
        return ans;

    }


}
