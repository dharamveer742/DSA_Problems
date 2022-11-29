package leetcode;

public class gasStation {

    public static int stationPosition(int[] gas,int[] cost){
        int total=0;
        int pos=-1;
        int currentGas=0;
        for(int i=0;i< gas.length;i++){
            int diff=gas[i]-cost[i];
            currentGas+=diff;
            total+=diff;
            if(currentGas<0){
                pos=i;
                currentGas=0;
            }
        }
        if(total>=0){
            return pos+1;
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost ={3,4,5,1,2};
        System.out.println(stationPosition(gas,cost));
    }

}
