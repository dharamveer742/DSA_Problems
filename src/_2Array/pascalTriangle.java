package Array;

import java.util.Arrays;

public class pascalTriangle {

    // print a specific row column  value       (0th index)  TC = O(C)   SC = O(1)
    public static void nCr(int r,int c){
        long res = 1;  // value of rC0
        for (int i = 0; i < c; i++) {
            res = res * (r- i);
            res = res / (i + 1);
        }
        System.out.println(res);
    }

    // print ith index row of pascals triangle (0th index)  O(Row)  SC = O(1)

    public static void printPascalsRow(int rowIndex){
       int[] ans = new int[rowIndex+1];
        long val=1;
        ans[0]=1;   
        for(int j=0;j<rowIndex;j++){
            val =  val*(rowIndex-j);
            val= val/(j+1);
            ans[j+1]=(int) val;
        }

        System.out.println(Arrays.toString(ans));
    }

    // print first n rows of pascal's triangle  O(N^2)
    public static void pascal(int rowIndex){
        for(int i=0;i<=rowIndex;i++){
            printPascalsRow((i));
        }
    }




    public static void main(String[] args) {
       // nCr(4,3);
       // printPascalsRow(4);
       pascal(4);
    }
}
