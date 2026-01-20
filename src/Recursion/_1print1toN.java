package Recursion;

public class print1toN {

    // head :- recursive call happens before the main work
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }

    // tail :-
    public static void print2(int n){
        if(n==0) return;
        System.out.println(n);
        print2(n-1);
    }


    public static void main(String[] args) {
        print(5);
        print2(5);
    }

}
