package Array;

public class searchInRoatetdSorted {
    public static int search(int[] arr , int target){
        int left = 0;
        int right= arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[left]<=arr[mid]){  // if left subarray partition is a strictly increasing
                if(target>=arr[left] && target<arr[mid]){   //
                    right = mid-1;
                }
                else{
                    left=mid+1;  // if target is not in this range then it can be present in the other partition
                }
            }
            else{
                if(target>arr[mid] && target<=arr[right] ){
                    left= mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,0,1,2,3,4,5,6};
        System.out.println(search(arr,8));

    }
}
