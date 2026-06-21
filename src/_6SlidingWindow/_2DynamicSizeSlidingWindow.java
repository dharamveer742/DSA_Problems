package _6SlidingWindow;

import java.util.HashMap;

public class _2DynamicSizeSlidingWindow {



    // Largest subArray with sum k only for positives
    public static int longestSubArrayWithSumK(int[] arr,int k){
        //if no subarray of sum k is present return 0
        int windowStart =0;
        int windowEnd=0;
        int sum=0;
        int ans=0;
        while(windowEnd<arr.length){
            sum+=arr[windowEnd];
            while(sum>k){
                sum-=arr[windowStart];
                windowStart++;
            }
            if(sum==k){
                ans=Math.max(ans,windowEnd-windowStart+1);
            }
            windowEnd++;
        }
        return ans;
    }


    // minimum size subArray Sum
    public static int minSubArrayLen(int k, int[] arr) {
        int sum = 0;
        int windowStart = 0;
        int windowEnd = 0;
        int minLength = Integer.MAX_VALUE;

        while (windowEnd < arr.length) {
            sum += arr[windowEnd];

            // shrink window as long as condition is satisfied
            while (sum >= k) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                sum -= arr[windowStart];
                windowStart++;
            }

            windowEnd++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }





    // both for positives and negatives TC = O(N) & SC = O(N)
    public static int getLongestSubarray(int []nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                maxLength=Math.max(maxLength,i+1);
            }
            if(mp.containsKey(sum-k)){
                maxLength = Math.max(maxLength,i-mp.get(sum-k));
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }

        return maxLength;
    }

}
