package String;

public class checkIfStringIsSubsequence_1 {
    // "ABCDEF"  "ADE" true

    public boolean isS2Subsequence(String s1,String s2){
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;j++;
            }
            else{
                i++;
            }

        }
       return  j==s2.length();

    }

    // Recursive code 

}
