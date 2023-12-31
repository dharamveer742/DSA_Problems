package Recursion;

public class printAllPermutations {
    // A string of length n have n! permutations

    public static void permutations(StringBuilder s,int index){
        if(index==s.length()-1) {
            System.out.println(s);
            return;
        }
        for(int j=index;j<s.length();j++){
           swap(s,index,j);
           permutations(s,index+1);
           // backtrack
            swap(s,index,j);
        }
    }
    public static void swap(StringBuilder s,int index1,int index2){
        Character ch = s.charAt(index1);
        s.setCharAt(index1,s.charAt(index2));
        s.setCharAt(index2,ch);
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        StringBuilder s = new StringBuilder(s1);
        permutations(s,0);
    }



    // TC = O(N!)

}
