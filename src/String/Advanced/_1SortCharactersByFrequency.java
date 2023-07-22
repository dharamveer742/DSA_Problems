package String.Advanced;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _1SortCharactersByFrequency {
    // TC = O(52log52) & O(52)

    public static void  frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        // SC = O(52)  and TC =  O(N) HashMap takes O(1) for look up and insertion
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        // O(52 log 52)
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b)->(map.get(b)-map.get(a)));
        // With the help of Lambda expression, we can pass a comparator directly to our priority queue to indicate how
        // it will prioritize itsJava objects or elements.

        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.poll();
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        System.out.println( sb.toString());
    }
}

// map.getOrDefault(key,value)