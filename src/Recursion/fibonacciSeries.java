package Recursion;

public class fibonacciSeries {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n =7;
        for(int i=0;i<n;i++){
            System.out.println(fibonacci(i));
        }
    }

}
 // TC = O(N*2^N)
