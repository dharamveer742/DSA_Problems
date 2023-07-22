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
    public boolean isSubSequence(String s1,String s2,int start1 ,int start2){
        if(start2==s2.length()){
            return true;
        }
        if(start1==s1.length()){
            return false;
        }
        if(s1.charAt(start1)==s2.charAt(start2)){
            return isSubSequence(s1,s2,start1+1,start2+1);
        }
        else{
            return isSubSequence(s1,s2,start1+1,start2);
        }
    }

    public static void main(String[] args) {
        checkIfStringIsSubsequence_1 ob = new checkIfStringIsSubsequence_1();
        String s1 ="ABC";
        String s2 = "Abh";
        System.out.println(ob.isSubSequence(s1,s2,0,0));
    }

}
