package Array;

public class equilibriumPoint {

    // Bruteforce :- O(N^2)

    // prefix sum and suffix sum :- O(N) & O(N)


    public static int equilibriumPoint(long arr[], int n) {  // O(N) & O(1)

        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            if(leftSum==sum-arr[i]){
                return i+1;
            }
            leftSum+=arr[i];
            sum-=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr = {1,3,5,2,2};
        int index = equilibriumPoint(arr, arr.length);
        System.out.println(index);
    }
}


