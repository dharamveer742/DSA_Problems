package Array.Matrix;

public class WaveTraversal {

    public static void print(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i][j]);
                }
            }
            else{
                for(int i= arr.length-1;i>=0;i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
    }
}
