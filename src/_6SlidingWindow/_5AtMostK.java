package _6SlidingWindow;

public class _5AtMostK {

    // count number of nice subArrays

    public int numberOfSubarrays(int[] nums, int k) {
        int atMostK = niceSubArrays(nums,k);
        int atMostkminus1 = niceSubArrays(nums,k-1);
        return atMostK - atMostkminus1;
    }
    public int niceSubArrays(int[] arr,int k){
        int odd =0;
        int cnt =0;
        int windowStart = 0;
        int windowEnd = 0;
        while(windowEnd<arr.length){
            if(arr[windowEnd]%2!=0){
                odd = odd+1;
            }
            while(odd>k && windowStart<arr.length){
                if(arr[windowStart]%2!=0){
                    odd = odd-1;
                }
                windowStart++;
            }
            cnt = cnt + (windowEnd-windowStart+1);
            windowEnd++;
        }
        return cnt;
    }
}
