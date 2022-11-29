package Array;

public class jumpGame {
  // Input: nums = [2,3,1,1,4]
  // Output: true
   public static boolean isReach(int[] arr){
      if(arr.length==1){
         return  true;
      }
      int maxReach = 0 ;
      for(int i=0;i<arr.length && maxReach>=i;i++){
         if(i+arr[i]>maxReach){
            maxReach=i+arr[i];
         }
         if(maxReach>= arr.length-1){
            return true;
         }
      }
      return  false;
   }

   public static void main(String[] args) {
      int[] arr ={2,0,0,1,4};
       System.out.println(isReach(arr));
   }

}
