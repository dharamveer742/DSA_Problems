package DP;

import java.util.Arrays;

// find the maximum profit by picking items in the given capacity
// pick item completely or don't pick it
// TC = O(2^n) we are trying to find all subsets
public class _01KnapSack {

    public static  int maxProfit(int[] wt,int[] val,int capacity,int n){
        if(n==0 || capacity==0){
            return 0;
        }
        if(wt[n-1]<=capacity){
            int included = val[n-1]+maxProfit(wt,val,capacity-wt[n-1],n-1);
            int notIncluded = maxProfit(wt,val,capacity,n-1);
            return Math.max(included,notIncluded);
        }
        else{
            return maxProfit(wt,val,capacity,n-1);
        }
    }

    public static int maxProfitMemoize(int[] wt,int[] val,int capacity,int n,int[][] profits){
        if(n==0 || capacity==0){
            return 0;
        }
        if(profits[n-1][capacity-1]!=-1){
            return profits[n-1][capacity-1];
        }
        if(wt[n-1]<=capacity){
            int included = val[n-1]+maxProfit(wt,val,capacity-wt[n-1],n-1);
            int notIncluded = maxProfit(wt,val,capacity,n-1);
            profits[n-1][capacity-1] =Math.max(included,notIncluded);
            return profits[n-1][capacity-1];
        }
        else{
            profits[n-1][capacity-1]= maxProfit(wt,val,capacity,n-1);
            return  profits[n-1][capacity-1];
        }
    }
    // dp
    public static int maxProfitDP(int[] wt,int[] val,int capacity){
        int[][] dp = new int[val.length+1][capacity+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(wt[i-1]<=j){
                    dp[i][j] =  Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[val.length][capacity];
    }


    public static void main(String[] args) {
        int[] val = {10,40,30,50};
        int[] wt = {5,4,6,3};
        int n= wt.length;
        int W =10;
        int[][] profits = new int[n+1][W+1];
        for(int[] row:profits) Arrays.fill(row,-1);
        System.out.println(maxProfitMemoize(wt,val,W,n,profits));
        System.out.println(maxProfitDP(wt,val,W));
    }

}
