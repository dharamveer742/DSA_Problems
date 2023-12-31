package Recursion;

public class Mean {
    public static int mean(int[] arr,int sum,int N){
        if(N==0){
            return 0;
        }
        if(N==1){
            return (sum+arr[N-1])/ arr.length;
        }
        return mean(arr,sum+arr[N-1],N-1);
    }



    public static void main(String[] args) {
        int [] arr ={};
        int ans =mean(arr,0, arr.length);
        System.out.println(ans);


    }
}
