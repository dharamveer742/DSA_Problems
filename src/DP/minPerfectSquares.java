package DP;

public class minPerfectSquares {

 /*   public static int perfectSquares(int N,int[] dp){
        if(N==0){
            return 0;
        }
        if(dp[N]!=-1){
            return dp[N];
        }
        int minAns=Integer.MAX_VALUE;
        for(int i=1;(i*i)<=N;i++){
            int currentAns=1+perfectSquares(N-(i*i),dp);
            if(currentAns<minAns){
                minAns=currentAns;
            }
        }
        dp[N]=minAns;
        return dp[N];
    }

    public static void main(String[] args) {
        int n=41;
        int[] dp=new int[n+1];
        for(int i=1;i<dp.length;i++){
            dp[i]=-1;
        }

        System.out.println(perfectSquares(n,dp));

    }    */

    public static int perfectSquares(int N) {

        int [] dp=new int[N+1];


        for(int i=1;i<=N;i++){
                int currAns = Integer.MAX_VALUE;
                int j = 1;
                    while (j * j <= i) {
                        if ((dp[i - (j * j)] + 1) < currAns) {
                        currAns = dp[i - (j * j)] + 1;
                    }
                    j++;
                }
                dp[i] = currAns;
            }


        return dp[N];
    }

    public static void main(String[] args) {
        System.out.println(perfectSquares(2));
    }



}
