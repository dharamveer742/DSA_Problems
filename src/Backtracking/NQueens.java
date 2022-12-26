package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    // Time Complexity = O(N^N)

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result  = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,result,0);
        return result;
    }
    public void helper(char[][] board, List<List<String>> result, int col){
        if(col==board.length){
            saveBoard(board,result);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';   // 21
                helper(board,result,col+1); // 2
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(int row,int col,char[][]board){
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // upper left diagonal
        int r=row;int c =col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        //upper right diagonal
        int r1=row;int c1 =col;
        while(r1>=0 && c1<board.length){
            if(board[r1][c1]=='Q'){
                return false;
            }
            r1--;
            c1++;
        }
        // lower left diagonal
        int r2=row;int c2 =col;
        while(r2<board.length && c2>=0){
            if(board[r2][c2]=='Q'){
                return false;
            }
            r2++;
            c2--;
        }
        // lower right diagonal
        int r3=row;int c3 =col;
        while(r3<board.length && c3<board.length){
            if(board[r3][c3]=='Q'){
                return false;
            }
            r3++;
            c3++;
        }
        return true;
    }
    public void saveBoard(char[][] board,List<List<String>> result){
        String row="";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                    row+="Q";
                else{
                    row+=".";
                }
            }
            newBoard.add(row);
        }
        result.add(newBoard);
    }

    public static void main(String[] args) {
        NQueens ob1 = new NQueens();
        List<List<String>> ans = ob1.solveNQueens(4);
        for(int i=0;i< ans.size();i++) {
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }





}
