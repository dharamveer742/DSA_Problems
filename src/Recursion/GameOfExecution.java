package Recursion;

public class GameOfExecution {

    public static int execute(int n,int k){
        if(n==1){
            return 0;
        }
        int x = execute(n-1,k);
        int y = (x+k)%n;
        return y ; 
    }

    public static void main(String[] args) {
        System.out.println(execute(7,3));
    }
}
