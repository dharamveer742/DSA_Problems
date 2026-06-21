package _6SlidingWindow;

import java.util.HashMap;

public class _3ReverseHashingWithCount {

    // count occurrences of Anagram

    int search(String pat, String txt) {
        HashMap<Character,Integer> map = new HashMap<>();
        int cnt =0;
        int windowStart=0;
        int windowEnd=0;
        int ans =0;

        for(int i=0;i<pat.length();i++){
            char c = pat.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
                cnt=cnt+1;
            }
        }

        while(windowEnd<txt.length()){
            char c = txt.charAt(windowEnd);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) cnt= cnt-1;
            }

            if(windowEnd-windowStart+1==pat.length()){
                if(cnt==0){
                    ans = ans+1;
                }
                char s = txt.charAt(windowStart);
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                    if(map.get(s)==1) cnt = cnt+1;
                }
                windowStart++;
            }
            windowEnd++;
        }
        return ans;
    }
}
