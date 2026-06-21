package _2Array.SlidingWindow;

public class maximumSumSubArrayK {
    public static int findMaximumSumSubArray(int[] arr,int k){   //
        int windowStart=0;
        int windowEnd = 0;
        int sum = 0;
        int ans = 0;
        while(windowEnd<arr.length){
            sum+=arr[windowEnd];   // calculation
            if((windowEnd-windowStart+1)<k){
                windowEnd++;
            }
            else if(windowEnd-windowStart+1==k){
                ans = Math.max(ans,sum);  // answer
                sum-=arr[windowStart];   // remove calculation
                windowStart++;            // slide the window
                windowEnd++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4 ,2, 3 ,6 ,5, 3};
        System.out.println(findMaximumSumSubArray(arr,1));
    }

}
