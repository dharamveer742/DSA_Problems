package Array;

public class GasStation {

    public static int startingIndex(int[]gas , int[] cost){
        int startingIndex=-1;
        int currentExtraGas = 0;
        int totalExtraGas =0;
        for(int i=0;i<gas.length;i++){
            int diff = gas[i]-cost[i];
            currentExtraGas+=diff;
            totalExtraGas+=diff;
            if(currentExtraGas<0){
                startingIndex=i;
                currentExtraGas=0;
            }
        }
        if(totalExtraGas>=0){
            return startingIndex+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println( startingIndex(gas,cost));
    }



}
