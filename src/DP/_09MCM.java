package DP;

import java.util.Arrays;

public class _09MCM {
    public static int matrixMultiplication(int[] arr) {
        int n = arr.length;
        return solve(arr, 1, n - 1);
    }

    private static int solve(int[] arr, int i, int j) {

        // Base case: single matrix or no matrix
        if (i >= j) return 0;

        int minCost = Integer.MAX_VALUE;

        // Try all possible splits
        for (int k = i; k <= j-1; k++) {

            int cost = solve(arr, i, k)
                    + solve(arr, k + 1, j)
                    + arr[i - 1] * arr[k] * arr[j];

            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    private static int solveMemo(int[] arr,int[][] memo, int i, int j) {

        // Base case: single matrix or no matrix
        if (i >= j){
            memo[i][j] = 0;
            return memo[i][j];
        }

        if(memo[i][j]!=-1) return memo[i][j];
        int minCost = Integer.MAX_VALUE;

        // Try all possible splits
        for (int k = i; k <= j-1; k++) {

            int cost = solveMemo(arr,memo, i, k)
                    + solveMemo(arr, memo,k + 1, j)
                    + arr[i - 1] * arr[k] * arr[j];

            minCost = Math.min(minCost, cost);
        }
        memo[i][j] = minCost;
        return memo[i][j];
    }



    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("The minimum number of operations are "+ matrixMultiplication(arr));
        int n = arr.length;
        int[][] memo = new int[n][n];
        for(int[] row: memo) Arrays.fill(row, -1);
        System.out.println(solveMemo(arr,memo,1,n-1));


    }
}
