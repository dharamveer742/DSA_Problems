package Array.SlidingWindow;

import java.util.*;

public class firstNegativeElement {
    public static int[] firstNegativeInKSizeWindow(int[] arr,int k){
        Queue<Integer> negatives =  new LinkedList<>();
        int windowStart=0;
        int windowEnd =0;
        int[] ans = new int[arr.length-k+1];
        int index =0;
        while(windowEnd< arr.length){
            if(arr[windowEnd]<0){
                negatives.offer(windowEnd);
            }
            if(windowEnd-windowStart+1<k){
                windowEnd++;
            }
            else if(windowEnd-windowStart+1==k){
                // if queue is Empty then add -1 in ans
                if(negatives.isEmpty()){
                    ans[index]=0;
                    index++;
                }
                else{
                    ans[index]=arr[negatives.peek()];
                    index++;
                }
                if( !negatives.isEmpty() &&  negatives.peek()==windowStart){
                    negatives.poll();
                }
                windowStart++;
                windowEnd++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1 ,2, 6, -5, -4};
        int[] ans  = firstNegativeInKSizeWindow(arr,2);
        System.out.println(Arrays.toString(ans));
    }
}
