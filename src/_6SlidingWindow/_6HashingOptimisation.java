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

    // Longest repeating char replacement  

    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int maxFreq=0;

        int windowStart = 0;

        int windowEnd =0;

        int ans =0;

        while(windowEnd<s.length()){

            freq[s.charAt(windowEnd)-'A']++;

            maxFreq = Math.max(maxFreq,freq[s.charAt(windowEnd)-'A']);

            while(windowEnd-windowStart+1-maxFreq>k){

                freq[s.charAt(windowStart)-'A']--;

                windowStart++;

            }

            ans=Math.max(ans,windowEnd-windowStart+1);

            windowEnd++;

        }

        return ans;

    }

}
