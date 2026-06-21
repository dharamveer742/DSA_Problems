package Array;

public class KadaneAlgo {
// -2,1,-3,4,-1,2,1,-5,4
    public static int maxSumSubArray(int[] arr){
      int maxSum = Integer.MIN_VALUE;
      int subStart=-1;
      int subEnd=-1;
      int start =-1;
      int sum=0;
      for(int i=0;i<arr.length;i++){
          if(sum==0){
              start = i;
          }
          sum+=arr[i];
          if(sum>maxSum){
              maxSum=sum;
              subStart=start;
              subEnd=i;
          }
          if(sum<0){  // Empty subArray sum
              sum =0;
          }
      }
      return maxSum ;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumSubArray(arr));
    }



}
