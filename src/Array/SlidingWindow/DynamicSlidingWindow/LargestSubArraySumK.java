package Array.SlidingWindow.DynamicSlidingWindow;

import java.util.HashMap;

public class LargestSubArraySumK {
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

    public static void main(String[] args) {
        int[] arr = {1 ,1, 1};
        System.out.println(getLongestSubarray(arr,4));

    }


}
