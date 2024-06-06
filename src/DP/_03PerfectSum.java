package DP;

import java.util.Arrays;

public class _03PerfectSum {
    public static int perfectSumMemoized(int arr[],int n, int sum)
    {
        // Your code goes here
        int[][] dp = new int[n+1][sum+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }

        int ans = helper(arr, n, dp, sum);
        return ans;
    }

    public static int helper(int a[], int n, int[][] dp, int target){

        if(n==0 && target==0) return dp[n][target] = 1;
        if(n==0) return dp[n][target] = 0;


        int mod = (int) 1e9+7;

        if(dp[n][target]!=-1) return dp[n][target];

        if(a[n-1]<=target){
            return dp[n][target] = (helper(a,n-1,dp,target-a[n-1]) + helper(a,n-1,dp,target))%mod;
        }else{
            return dp[n][target] = helper(a,n-1,dp,target);
        }
    }

    public static int perfectSum(int arr[],int n, int sum) {

        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = (dp[i - 1][j - arr[i - 1]] + dp[i - 1][j]) % 1000000007;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {0,10};
        int sum =10;
        System.out.println(perfectSumMemoized(arr, arr.length,sum));
        System.out.println(perfectSum(arr,arr.length,sum));
    }

}
