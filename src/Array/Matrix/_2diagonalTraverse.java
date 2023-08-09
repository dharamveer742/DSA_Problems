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

    public static void main(String[] args) {
        int[][] mat ={{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = findDiagonalOrder(mat);
        System.out.println(Arrays.toString(ans));

    }
}
