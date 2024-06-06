package DP;

import java.util.Arrays;

public class _04UnboundedKnapsack {
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int[][] memo = new int[N+1][W+1];
        for(int i=0;i<=N;i++){
            Arrays.fill(memo[i],-1);
        }
        knapSackMemoized(wt,val,N,W,memo);
        return memo[N][W];

    }
    static int knapSackMemoized(int[] wt,int[] val,int N,int W,int[][] memo){
        if(N==0 || W==0) return 0;
        if(memo[N][W]!=-1) return memo[N][W];

        if(wt[N-1]<=W){
            memo[N][W] = Math.max((val[N-1]+knapSackMemoized(wt,val,N,W-wt[N-1],memo)),knapSackMemoized(wt,val,N-1,W,memo));
            return memo[N][W];
        }
        else{
            memo[N][W] = knapSackMemoized(wt,val,N-1,W,memo);
            return memo[N][W];
        }
    }

    public static void main(String[] args) {
        int N =4;
        int W = 8;
        int val[] = {6, 1, 7, 7};
        int wt[] = {1, 3, 4, 5};
        System.out.println(knapSack(N,W,val,wt));
    }
}
