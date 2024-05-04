package DP;

import java.util.Arrays;

public class _02subSetSumProblem {
    public static boolean isSumPresent(int[] arr,int sum,int n){
        if(sum==0){
            return true;
        }
        if(n==0) return false;
        if(arr[n-1]<=sum){
            boolean included = isSumPresent(arr,sum-arr[n-1],n-1);
            boolean notIncluded = isSumPresent(arr,sum,n-1);
            return included || notIncluded;
        }
        else{
            // can't pick this element (val > required sum)
            boolean skipped = isSumPresent(arr,sum,n-1);
            return skipped;
        }
    }

    public static int subSetSumMemoized(int[] arr,int[][] memo,int n,int sum){
        if(sum == 0 ) return  1;
        if(n == 0) return 0;
        if(memo[n][sum] != -1) return memo[n][sum];
        if(arr[n-1]<=sum){
            int included = subSetSumMemoized(arr,memo,n-1,sum-arr[n-1]);
            int notIncluded = subSetSumMemoized(arr,memo,n-1,sum);

            if(included == 1 || notIncluded==1){
                memo[n][sum] = 1;
                return memo[n][sum];
            }
            else{
                memo[n][sum] = 0;
                return memo[n][sum];
            }
        }
        else{
            int notIncluded = subSetSumMemoized(arr,memo,n-1,sum);
            memo[n][sum] = notIncluded;
            return memo[n][sum];
        }
    }

    

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int n = arr.length;
        int sum = 30;
        boolean ans = isSumPresent(arr,sum,n);
        System.out.println(ans);

        int[][] memo = new int[n+1][sum+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }

        if(subSetSumMemoized(arr,memo,n,sum)==1) System.out.println(true);
        else System.out.println(false);


    }
}
