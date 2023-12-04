package Array;

public class maximumSubArray {
// -2,1,-3,4,-1,2,1,-5,4
    public static int maxSubArray(int[] arr){
        int n= arr.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=arr[0];
        for(int i=1;i<n;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }



}
