package _6SlidingWindow;

import java.util.HashMap;

public class _6HashingOptimisation {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left =0;
        int right=0;
        int maxLen = 0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                // if repeating charcter index in (current sub string)left-right range
                left = Math.max(map.get(s.charAt(right)),left);
                left++;
            }

            map.put(s.charAt(right),right);
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
