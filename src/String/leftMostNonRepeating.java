package String;

import java.util.Arrays;

public class leftMostNonRepeating {
    public static int leftMostNonRepeatingChar(String s){
        int[] count = new int[256];
        Arrays.fill(count,-1);
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==-1){
                count[s.charAt(i)]=i;
            }
            else{
                count[s.charAt(i)]=-2;
            }
        }
        int ans =Integer.MAX_VALUE;
        for(int i=0;i<count.length;i++){
            if(count[i]>=0){
                ans = Math.min(ans,count[i]);
            }
        }
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
    public static void main(String[] args) {
        String s = "apple";
        System.out.println(leftMostNonRepeatingChar(s));
    }
}
