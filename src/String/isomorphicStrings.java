package String;

import java.util.HashMap;
import java.util.HashSet;

public class isomorphicStrings {
    // Brute force = O(N^2) + O(N^2)
    public static boolean isIsomorphic(String s ,String t){
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 =t.charAt(i);

            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                if(set.contains(ch2)){
                    return false;
                }
                map.put(ch1,ch2);
                set.add(ch2);
            }


        }
        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t= "kike";
        System.out.println(isIsomorphic(s,t));

    }
}
