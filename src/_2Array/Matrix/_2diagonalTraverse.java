package Array.Matrix;

import java.util.Arrays;

public class _2diagonalTraverse {


    public static  int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if(m==0 || n==0){
            return new int[0];
        }
        int [] ans = new int[m*n];
        int index=0;
        int row =0;
        int col=0;
        for(int i=0;i<m*n;i++){
            ans[index] = mat[row][col];
            index++;
            if((row+col)%2==0){
                if(col==n-1){
                    row++;
                }
                else if(row==0){
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row==m-1){
                    col++;
                }
                else if(col==0){
                    row++;
                }
                else{
                    row++;
                    col--;
                }
            }

        }
        return ans;
    }

    // given a square matrix
    public static void upperDiagonal(int[][] mat){
        int rows= mat.length;
        for(int g=0;g<rows;g++){
            int row=0;
            int col=g;
            while(col<rows){
                System.out.println(mat[row][col]);
                row++;
                col++;
            }
        }
    }
    

    public static void  main(String[] args) {
        int[][] mat ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 ={{00,01,02,03,04,05},{10,11,12,13,14,15},{20,21,22,23,24,25},{30,31,32,33,34,35},{40,41,42,43,44,45},{50,51,52,53,54,55}};
        int[] ans = findDiagonalOrder(mat);
        System.out.println(Arrays.toString(ans));
        System.out.println();
        upperDiagonal(mat2);

    }
}
