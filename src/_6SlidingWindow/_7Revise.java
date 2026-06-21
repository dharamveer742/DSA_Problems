package _6SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class _7Revise {

    // sliding window Maximum
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int windowStart = 0;
        int windowEnd = 0;
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int index =0 ;
        while(windowEnd<nums.length){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[windowEnd]){
                dq.pollLast();
            }
            dq.offer(windowEnd);
            if(windowEnd-windowStart+1==k){
                while(!dq.isEmpty() && dq.peekFirst()<windowStart){
                    dq.pollFirst();
                }
                ans[index] = nums[dq.peekFirst()];
                index++;
                windowStart++;
            }
            windowEnd++;
        }
        return ans;
    }

    // max Points you can obtain from cards

    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // Step 1: total sum
        int totalSum = 0;
        for (int num : cardPoints) {
            totalSum += num;
        }

        if (k == n) return totalSum;

        int windowSize = n - k;

        int sum =0;
        int windowStart = 0;
        int windowEnd = 0;
        int minSum = Integer.MAX_VALUE;

        while(windowEnd<n){
            sum = sum + cardPoints[windowEnd];
            if(windowEnd-windowStart+1==windowSize){
                minSum = Math.min(sum,minSum);
                sum = sum - cardPoints[windowStart];
                windowStart++;
            }
            windowEnd++;
        }
        return totalSum - minSum;

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
