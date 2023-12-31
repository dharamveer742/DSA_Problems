package Recursion;

public class palindrome {
    public static boolean isPalindrome(String str,int first,int last){
        if(first>=last){  // no character is left to compare
            return true;
        }
        if(str.charAt(first)!=str.charAt(last)){
            return false;
        }
        return isPalindrome(str,first+1,last-1);
    }

    public static void main(String[] args) {
        String str  = "nitin";
        boolean ans = isPalindrome(str,0,str.length()-1);
        System.out.println(ans);
    }

}
