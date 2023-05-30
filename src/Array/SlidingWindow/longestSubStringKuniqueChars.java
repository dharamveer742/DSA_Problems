package Array.SlidingWindow;
import java.util.HashMap;
public class longestSubStringKuniqueChars {

    // maximum sum subarray of size k
    // first negative number in every window of size k


    public static int findLongestSubstring(String s , int k){
        int ans = Integer.MIN_VALUE;
        HashMap<Character,Integer> uniqueChars = new HashMap<>();
        int i=0;
        int j=0;
        while(j<s.length()){
            if(uniqueChars.containsKey(s.charAt(j))){
                uniqueChars.put(s.charAt(j),uniqueChars.get(s.charAt(j))+1);
            }
            else{
                uniqueChars.put(s.charAt(j),1);
            }
            j++;    // CI
            while(uniqueChars.size()>k){

                    uniqueChars.put(s.charAt(i),uniqueChars.get(s.charAt(i))-1);


                if(uniqueChars.get(s.charAt(i))==0){
                    uniqueChars.remove(s.charAt(i));

                }
                i++;
            }
            if(uniqueChars.size()==k){
                ans = Math.max(ans,j-i);
            }


        }
        return ans;
    }

    public static void main(String[] args) {
        int nas  = findLongestSubstring("aabacbebebe",3);

        System.out.println(nas);
    }


}
