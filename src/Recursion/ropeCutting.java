package Recursion;

public class ropeCutting {
    public static int maxPieces(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0 ) return -1;

        int aPieces = maxPieces(n-a,a,b,c);
        int bPieces = maxPieces(n-b,a,b,c);
        int cPieces = maxPieces(n-c,a,b,c);

        int pieces = Math.max(aPieces,Math.max(bPieces,cPieces));

        if(pieces<0){
            return -1;
        }
        else{
            return 1+pieces;
        }
    }

    public static void main(String[] args) {
        int ans = maxPieces(23,9,11,12);
        System.out.println(ans);
    }
}
