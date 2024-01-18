package Array;

public class maximumSumCircular {

    public static int kadane(int[] arr){
        int sum =0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }

    public static int overallMax(int[] arr){
        int maxNormalSum = kadane(arr);
        if(maxNormalSum<0) return maxNormalSum;
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
            arr[i]=-arr[i];
        }
        int minSum = kadane(arr);
        int maxCircularSum = totalSum+ minSum;
        return Math.max(maxNormalSum,maxCircularSum);
    }

    public static void main(String[] args) {
        int[] arr = {-3,-2,-3};
        int ans = overallMax(arr);
        System.out.println(ans);
    }

}
