package Array.Matrix;


import java.util.*;
public class _1matrixMultiplication {
    public static void multiply(int[][] mat1,int[][] mat2){
        int r1=mat1.length; //3
        int c1 = mat1[0].length;  // 2
        int r2=mat2.length; // 2
        int c2 = mat2[0].length; // 3
        if(c1!=r2){
            System.out.println("can't multiply");

            return;
        }
        int[][] ans = new int[r1][c2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                int mul = 0;
                for(int k=0;k<c1;k++){
                    mul+= mat1[i][k]*mat2[k][j];
                }
                ans[i][j]=mul;
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }

    public static void main(String[] args) {
        int[][]mat1= { {1, 1}, {2, 2}, {3, 3} };
        int[][] mat2= { {1, 1, 1}, {2, 2, 2} };
        multiply(mat1,mat2);
    }
}
