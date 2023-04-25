package Array;

public class hIndex2 {
    public static void main(String[] args) {
        int[] citations = {1,2,6,7,8,9};
        System.out.println(hIndex2(citations));
    }
    public static int  hIndex2(int[] citations){
        int low=0;
        int high = citations.length-1;
        int n = citations.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(citations[mid]==n-mid){
                return citations[mid];
            }
            else if(citations[mid]>n-mid){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return n-low;


    }
}
