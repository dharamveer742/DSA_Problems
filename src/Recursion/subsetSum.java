package Recursion;

public class subsetSum {

    public static int countSubsets(int[] arr,int sum,int i){
        if(sum==0){
            return 1;
        }
        if(i==arr.length){
            return  0;
        }
        if(sum<0){
            return  0 ;
        }

        return countSubsets(arr,sum-arr[i],i+1)+countSubsets(arr,sum,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {5,10,15,20};
        int ans= countSubsets(arr,25,0);
        System.out.println(ans);
    }

}

// duplicate element in input :- subset may also have duplicate