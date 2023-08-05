package String.Advanced;

import java.util.Arrays;

public class _3KMP {
    // compute lps for every i size string starting from index 0
    public static void fillLPS(String pattern,int[] lps){
        int m = pattern.length();
        int len=0;
        lps[0]=0;
        for(int i=1;i<m;){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    len=lps[len-1];
                }
            }
        }

    }

    public static void main(String[] args) {
            String pattern = "aaabaaaac";
            int[] lps = new int[pattern.length()];
            System.out.println(Arrays.toString(lps));
            fillLPS(pattern,lps);
            System.out.println(Arrays.toString(lps));
    }

}
