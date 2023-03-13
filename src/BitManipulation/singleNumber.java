package BitManipulation;


// problem :- Every number is occurring even times or twice find the odd or single time appearing number
public class singleNumber {
    // O(N^2)
    public static int findOdd(int[] arr){
        int ans = arr[0];
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]) count++;
            }
            if(count ==1 || count%2!=0){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
    // O(N)
    public static int eFindOdd(int[] arr){
        int xor =0;
        for(int i=0;i<arr.length;i++){
            xor = xor^arr[i];
        }
        return  xor;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        System.out.println(eFindOdd(arr));
    }

}
