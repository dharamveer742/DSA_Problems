package Array;

import java.util.HashMap;

/*
The length of the subarray is k, and

All the elements of the subarray are distinct.

Return the maximum subarray sum of all the subArrays that meet the conditions

 */
public class maximumSubarrayDistinctK {
    public static int maximumSubarraySum(int[] nums, int k) {
        int sum=0;
        int maxSum = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<k-1;i++){
            sum+=nums[i];
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
        }
        for(int i=k-1;i<nums.length;i++){  // i=2 2-3+1
            sum+=nums[i];
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
            if(freq.size()==k){
                maxSum=Math.max(sum,maxSum);
            }
            int count = freq.get(nums[i-k+1]);

            if(count==1){
                freq.remove(nums[i-k+1]);
            }
            else{
                freq.put(nums[i-k+1],freq.get(nums[i-k+1])-1);
            }
            sum-=nums[i-k+1];

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
       int ans = maximumSubarraySum(nums,3);
        System.out.println(ans);
    }
}
