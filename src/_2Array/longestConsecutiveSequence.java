package Array;

import java.util.HashSet;

public class longestConsecutiveSequence {
    // given a unsorted array  return the length of  Consecutive Sequence that can be formed from these array elements .

    public int maxLengthSequence(int[] arr){
        if(arr.length==0){
            return  0;
        }
        HashSet<Integer> hs =  new HashSet();
        for(int i=0;i< arr.length;i++){
            hs.add(arr[i]);
        }
        int maxSequence =1 ;
        for(int i=0;i< arr.length;i++){
            if(hs.contains(arr[i]-1)){
                continue;
            }
            else{
                int currLength = 0;
                int current = arr[i];
                while(hs.contains(current)){
                    currLength++;
                    current++;
                }
                maxSequence = Math.max(maxSequence,currLength);
            }
        }
        return maxSequence;
    }

    public static void main(String[] args) {
        longestConsecutiveSequence ob = new longestConsecutiveSequence();
        int[] arr =  {1,2,50,5,60,3,4};
        System.out.println(ob.maxLengthSequence(arr));
    }
}
