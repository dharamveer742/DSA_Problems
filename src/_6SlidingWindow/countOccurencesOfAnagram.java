package _2Array.SlidingWindow;

import java.util.HashMap;

public class countOccurencesOfAnagram {
    // o(N^2)  & O(26) :- for each substring of length k starting from ith index match with anagram

    public static void countAll(String s,String pattern){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(freq.containsKey(pattern.charAt(i))){
                freq.put(pattern.charAt(i),freq.get(pattern.charAt(i))+1);
            }
            else{
                freq.put(pattern.charAt(i),1);
            }
        }
        int windowStart=0;
        int windowEnd =0;
        int ans =0;
        int count = freq.size();
        while(windowEnd<s.length()){
            if(freq.containsKey(s.charAt(windowEnd))){
                int elementCount = freq.get(s.charAt(windowEnd));
                freq.put(s.charAt(windowEnd), elementCount - 1);
                if(elementCount==1){
                    count = count-1;  // count = count--;
                }
            }
            if(windowEnd-windowStart+1<pattern.length()){
                windowEnd++;
            }
            else if(windowEnd-windowStart+1==pattern.length()){
                if(count==0){
                    ans++;
                }
                if(freq.containsKey(s.charAt(windowStart))){
                    freq.put(s.charAt(windowStart),freq.get(s.charAt(windowStart))+1);
                    if(freq.get(s.charAt(windowStart))==1){
                        count=count+1;
                    }

                }
                windowStart++;
                windowEnd++;
            }


        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        countAll("aaaabb","aab");
    }
}
