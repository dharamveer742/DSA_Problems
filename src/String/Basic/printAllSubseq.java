package String;

import java.util.ArrayList;

// pick and don"t pick concept

// TC :- O(2^N) SC:- O(N):-recursion stack

public class printAllSubseq {
    public static void print(String input){
        ArrayList<String> al = new ArrayList<>();
        find(input,al,"");
        System.out.println(al+" "+al.size());
    }
    public static void find(String input,ArrayList<String> al,String ans){
            if(input.length()==0){
                al.add(ans);
                return ;
            }
            find(input.substring(1),al,ans+input.charAt(0)); // pick the first character and include it in the ans
            find(input.substring(1),al,ans);

    }
    public static void main(String[] args) {
        String s="abc";
        print(s);
    }
}
