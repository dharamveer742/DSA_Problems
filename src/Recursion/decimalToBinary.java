package Recursion;

public class decimalToBinary {
    public static int binary(int N){
        if(N==0) return 0;
        return (N%2)+10*binary(N/2);
    }

    public static int binaryIter(int N){
        int bin =0;
        int pw=1;
        while (N>0){
            int parity = N%2;
            bin = bin + (pw*parity);
            N=N/2;
            pw=pw*10;
        }
        return bin;
    }



    public static void main(String[] args) {
        int ans = binary(7);
        System.out.println(ans);
        System.out.println(binaryIter(8));

    }
}




