package DP;

import java.util.Arrays;

// Find the maximum amt
// [2,7,1,5,20]  = [2,7,7,12,27]
public class houseRobbers_5 {
    /* Recursive


    public int maxAmtRob(int[] houses,int currentIndex){

        if(currentIndex>=houses.length){
            return 0;
        }
        int robCurrentHouse = houses[currentIndex]+maxAmtRob(houses,currentIndex+2);
        int skipCurrentHouse = maxAmtRob(houses,currentIndex+1);

         return  Math.max(robCurrentHouse,skipCurrentHouse);
    } */


   /* Recursive dp

    public int maxAmtRob(int[] houses,int[] dp,int currentIndex){


        if(currentIndex>=houses.length){
            return 0;
        }
        if(dp[currentIndex]!=-1){
            return dp[currentIndex];
        }
        int robCurrentHouse = houses[currentIndex]+maxAmtRob(houses,dp,currentIndex+2);
        int skipCurrentHouse = maxAmtRob(houses,dp,currentIndex+1);

        return dp[currentIndex] =Math.max(robCurrentHouse,skipCurrentHouse);
    }

    /* Iterative dp */

    public int maxAmtRob(int[] houses){
        if(houses.length==1){
            return  houses[0];
        }
        if(houses.length==2){
            return Math.max(houses[0],houses[1]);
        }
        int[] dp = new int[houses.length];
        dp[0]=houses[0];
        dp[1]=Math.max(houses[0],houses[1]);
        for(int house=2;house<houses.length;house++){
            dp[house]=Math.max(dp[house-1],houses[house]+dp[house-2]);
        }
        return dp[houses.length-1];
    }

}
class Main{
    public static void main(String[] args) {
        houseRobbers_5 ob = new houseRobbers_5();
        int[] houses = {2,1,1,2};
      //  int[] dp = new int[houses.length];
      //   Arrays.fill(dp,-1);
        System.out.println(ob.maxAmtRob(houses));

    }
}
