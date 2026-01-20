package DP;

import java.util.Arrays;

public class coinChange1 {
    private static final int INF = (int) 1e9;

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] memo;
        memo = new int[n + 1][amount + 1];



        // initialize dp with -1 (means "not computed")
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }

        int ans = solve(coins, n, amount,memo);
        return ans >= INF ? -1 : ans;
    }

    private int solve(int[] coins, int n, int amount,int[][] memo) {

        // base cases
        if (amount == 0) return 0;
        if (amount < 0) return INF; //
        if (n == 0) return INF;

        // memo check
        if (memo[n][amount] != -1)
            return memo[n][amount];

        // choice diagram (same as your recursion)
        if (coins[n - 1] <= amount) {
            memo[n][amount] = Math.min(
                    1 + solve(coins, n, amount - coins[n - 1],memo), // include (unbounded)
                    solve(coins, n - 1, amount,memo)                  // exclude
            );
        } else {
            memo[n][amount] = solve(coins, n - 1, amount,memo);
        }

        return memo[n][amount];
    }



    public int coinChangeDP(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        // Base case initialization
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = INF;   // no coins, positive amount → impossible
        }

        // dp[i][0] = 0 already by default

        // Fill the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {

                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(
                            1 + dp[i][j - coins[i - 1]], // include (unbounded)
                            dp[i - 1][j]                 // exclude
                    );
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount] >= INF ? -1 : dp[n][amount];
    }


    // 1 d dp


    public int coinChange1D(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];

        for (int j = 1; j <= amount; j++) {
            dp[j] = INF;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[j] = Math.min(1 + dp[j - coins[i - 1]],dp[j]);
                }
                else {
                    dp[j] = dp[j];
                }
            }
        }

        return dp[amount] >= INF ? -1 : dp[amount];
    }

}
