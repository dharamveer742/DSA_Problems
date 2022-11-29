package Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class slidingMaximumWindow {

    //TC = O(N) we can poll at most N elements
    // SC =O(K)

    public static int[] maxInWindows(int[] arr,int k){
        int len = arr.length;
        int ansIndex=0;
        int[] maximums = new int [(len-k)+1];
        Deque<Integer> d = new ArrayDeque<>();
        for(int i=0;i<len;i++){
            if(!d.isEmpty() && d.peekFirst()<i-k+1){
                d.pollFirst();
            }
            while(!d.isEmpty() && arr[i]>arr[d.peekLast()]){
                d.pollLast();
            }
            d.offer(i);
            if(i-k+1>=0){
                maximums[ansIndex++]=arr[d.peekFirst()];
            }

        }
        return maximums;
    }

    public static void main(String[] args) {
        int []  nums = {1,2,3,-1,-2,-4,5};
        System.out.println(Arrays.toString(maxInWindows(nums,3)));
    }

}
