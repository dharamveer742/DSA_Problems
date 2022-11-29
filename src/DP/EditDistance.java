package DP;

public class EditDistance {

    public static void distance(String word1,String word2){
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<dp[0].length;i++) { // filling first row  // operations required to make the word1 blank from ith character
            dp[0][i]=i;
        }
        for(int i=0;i<dp.length;i++){    // filling first column of each row  // no of add operations to make a blank string equal to ith charcter substring
            dp[i][0]=i;
        }
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
                }
            }
        }
        System.out.println(dp[word1.length()][word2.length()]);

    }

    public static void main(String[] args) {
        distance("a","b");
    }

}
