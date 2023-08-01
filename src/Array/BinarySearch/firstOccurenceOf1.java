package Array.BinarySearch;

public class firstOccurenceOf1 {
    // array conatins only
    public static int find(int[] arr){
        if(arr[0]==1) return 0;
        int start = 0;
        int end=1;
        while(arr[end]!=1){
            start=end;
            end=end*2;
        }
        // find first occurrence  of 1 in range we have found
        int res=Integer.MAX_VALUE;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==1){
                res=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return  res;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1}; // an infinite array of zeros and once;
        System.out.println(find(arr));
    }
}
