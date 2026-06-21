package _6SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _1FixedSizeSlidingWindow {

    // maximum sum SubaArray with size k
    public static int maxSum(int[] arr,int k){
        int sum =0;
        int maxSum =0;
        int windowStart=0;
        int windowEnd=0;
        while(windowEnd<arr.length){
            sum+=arr[windowEnd];
            if(windowEnd-windowStart+1==k){
                maxSum=Math.max(sum,maxSum);
                sum = sum-arr[windowStart];
                windowStart++;
            }
            windowEnd++;
        }
        return maxSum;
    }

    // First Negative Number in every window of size k
    static List<Integer> firstNegInt(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int windowStart=0;
        int windowEnd=0;
        while(windowEnd<arr.length){
            if(arr[windowEnd]<0){
                q.offer(windowEnd);
            }
            if(windowEnd-windowStart+1==k){
                if(!q.isEmpty()){
                    ans.add(q.peek());
                    if(q.peek()<=windowStart){
                        q.poll();
                    }
                }
                else{
                    ans.add(0);
                }
                windowStart++;
            }
            windowEnd++;
        }
        return ans;
    }

}
