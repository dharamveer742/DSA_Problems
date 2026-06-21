package Array;

public class jumpGame {
  // Brute force approach
   public static boolean isReachRecursive(int[] arr,int index,int N){
      if(index>=N-1){
         return true;
      }
      for(int i=index+1;i<=index+arr[i] && i<N;i++){
          boolean ans = isReachRecursive(arr,i,N);
          if(ans) return true;
      }
      return false;
   }



    //optimised O(N)
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
      int[] arr ={2,3,1,1,4};
       System.out.println(isReachRecursive(arr,0, arr.length));
   }

}
