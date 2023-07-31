package Array.BinarySearch;

public class _1countHowManyTimeSortedArrayIsRotated {
    public static int count(int[] arr){
        int N =arr.length;
        int left =0;
        int right = N-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            System.out.println("mid " +mid);
            int next = (mid+1)% N;
            int previous = (mid + N-1)%N;
            if(arr[mid]<=arr[next] && arr[mid]<=arr[previous]){

                return N-mid;
            }
            else if(arr[0]<=arr[mid]){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,1,2};  // sorted and left rotated array
        System.out.println(count(arr));
    }
}
