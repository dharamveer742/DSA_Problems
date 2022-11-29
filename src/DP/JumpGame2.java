package DP;

import java.util.Arrays;

public class JumpGame2 {
    public static int minJumps(int[] nums){
        int len=nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[len-1]=0;
        for(int i=len-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<=Math.min(len-1,i+nums[i]);j++){
                min=Math.min(min,dp[j]);
            }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,4};
        System.out.println(minJumps(arr));
    }
}
