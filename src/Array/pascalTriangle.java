package Array;

import java.util.Arrays;

public class pascalsTriangle2 {


    public static void printPascalsRow(int rowIndex){
       int[] ans = new int[rowIndex+1];
        long val=1;
        for(int j=0;j<=rowIndex;j++){   // for any specific col <rowIndex
            ans[j]=(int) val;
            val =  val*(rowIndex-j);
            val= val/(j+1);
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        printPascalsRow(4);
    }
}
