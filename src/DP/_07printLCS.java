package DP;

import java.util.Arrays;

public class _07lcs {
    public static int lcs(String s1,String s2){
        return solve(s1,s2,s1.length(),s2.length());
    }


    private static int solve(String s1, String s2, int i, int j) {
        // Base case
        if (i == 0 || j == 0) return 0;

        // If last characters match
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return 1 + solve(s1, s2, i - 1, j - 1);
        }

        // If last characters do not match
        return Math.max(
                solve(s1, s2, i - 1, j),
                solve(s1, s2, i, j - 1)
        );
    }



    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solveMemo(text1, text2, n, m,dp);
    }

    private int solveMemo(String s1, String s2, int i, int j,int[][] dp) {
        // Base case
        if (i == 0 || j == 0) return 0;

        // Memoized result
        if (dp[i][j] != -1) return dp[i][j];

        // If characters match
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            dp[i][j] = 1 + solveMemo(s1, s2, i - 1, j - 1,dp);
        } else {
            dp[i][j] = Math.max(
                    solveMemo(s1, s2, i - 1, j,dp),
                    solveMemo(s1, s2, i, j - 1,dp)
            );
        }
        return dp[i][j];
    }

    public int longestCommonSubsequenceDP(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];

        // Build DP table bottom-up
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(
                            dp[i - 1][j],
                            dp[i][j - 1]
                    );
                }
            }
        }
        return dp[n][m];
    }

    public int longestCommonSubsequenceSpaceOptimised(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[] prev = new int[m + 1];
        int[] curr = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    curr[j] = 1 + prev[j - 1];
                } else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }
            // Move current row to previous row
            prev = curr.clone();
        }
        return prev[m];
    }

    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        System.out.println(lcs(s1,s2));
    }
}
