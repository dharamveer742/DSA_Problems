package Recursion;

public class reverseString {

    public static String reverse(String str,int index){
        if(index==str.length()){
            return "";
        }
        return reverse(str,index+1) + str.charAt(index);
    }

    public static void main(String[] args) {
        System.out.println(reverse("abc",0).length());
    }
}

// TC = O(N^2)
