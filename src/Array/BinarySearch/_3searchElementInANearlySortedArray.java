package Array.BinarySearch;

public class searchElementInANearlySortedArray {
    public static int search(int[] arr,int key){
        int size = arr.length;
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(mid>0 && arr[mid-1]==key){
                return mid-1;
            }
            else if(mid<size-1 && arr[mid+1]==key){
                return mid+1;
            }
            else if(arr[mid]>key){
                right = mid-2;
            }
            else{
                left =mid+2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nearlySorted = {10, 3, 40, 20, 50, 80, 70};
        System.out.println(search(nearlySorted,70));
    }
}
