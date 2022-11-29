package DP;
//Wrong 8
public class stepsToOne {
    static int c=0;

public static int minSteps(int N,int[] dp){
    if(N==1){
        return 0;
    }
    c++;
    int ans1;
    if(dp[N-1]==-1) {
         ans1 = minSteps(N - 1, dp);
        dp[N]=ans1;
    }
    else{
        ans1=dp[N-1];
    }
    int ans2=Integer.MAX_VALUE;
    if(N%2==0){
        if(dp[N/2]==-1) {
            ans2 = minSteps(N / 2, dp);
            dp[N]=ans2;
        }
        else{
            ans2=dp[N/2];
        }

    }
    int ans3=Integer.MAX_VALUE;
    if(N%3==0){
        if(dp[N/3]==-1) {
            ans3 = minSteps(N / 3, dp);
            dp[N]=ans3;
        }
        else{
            ans3=dp[N/3];
        }
    }

    return Math.min(ans1,Math.min(ans2,ans3))+1;

}

    public static void main(String[] args) {
        int n=8;
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        System.out.println( minSteps(n,dp));


    }



}
