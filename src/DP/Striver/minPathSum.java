package DP.Striver;

import java.util.Arrays;

public class minPathSum {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] memo = new int[m][n];
        for(int[] row:memo){
            Arrays.fill(row,-1);
        }
        return solve(grid,m-1,n-1,memo);
    }

    public int solve(int[][] grid,int i,int j,int[][] memo){
        if(i==0 && j==0) return grid[i][j];
        if(i<0 || j<0) return Integer.MAX_VALUE/2;
        if(memo[i][j]!=-1) return memo[i][j];
        int left = grid[i][j]+solve(grid,i,j-1,memo);
        int top = grid[i][j]+solve(grid,i-1,j,memo);
        memo[i][j]=Math.min(left,top);
        return memo[i][j];
    }

    public int minPathSumDP(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) dp[i][j] = grid[i][j];
                else if(i==0){
                    dp[i][j]=grid[i][j]+dp[i][j-1];
                }
                else if(j==0){
                    dp[i][j]=grid[i][j]+dp[i-1][j];
                }
                else{
                    int left = grid[i][j]+dp[i][j-1];
                    int top = grid[i][j]+dp[i-1][j];
                    dp[i][j]=Math.min(left,top);
                }
            }
        }
        return dp[m-1][n-1];
    }
}
