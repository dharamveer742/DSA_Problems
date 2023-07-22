package String;

import java.util.Arrays;

public class anagram_2 {
    public boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] count = new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]+=1;
            count[s2.charAt(i)]-=1;

        }
        for(int i=0;i<s1.length();i++){
            if(count[s1.charAt(i)]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       anagram_2 ob = new anagram_2();
       /* String s1 = "care by";
        String s2 = "race by";
        boolean ans = ob.isAnagram(s1,s2);
        System.out.println(ans);*/



        String check = "";
        System.out.println(check);
        ob. change(check);
        System.out.println(check);
    }
    public void change(String check){  // a copy of reference
        check="changed";  // check object is pointing to a new reference  // string is immutable so new string object is created

    }
}
