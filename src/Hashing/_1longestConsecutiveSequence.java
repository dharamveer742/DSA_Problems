package Hashing;

import java.util.HashSet;

public class _1longestConsecutiveSequence {
    public static int longest(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int maxLength=0;
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i]-1)){
                continue;
            }
            else{
                int length=0;
                int current = arr[i];
                while(hs.contains(current)){
                    length++;
                    current=current+1;
                }
                maxLength=Math.max(maxLength,length);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,6,-2};
        System.out.println(longest(arr));
    }
}
