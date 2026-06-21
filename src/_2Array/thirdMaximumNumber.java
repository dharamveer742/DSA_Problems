package Array;

public class thirdMaximumNumber {

        // O(NlogN)
  /*  public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int cnt =1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                cnt++;
            }
            if(cnt==3){
                return nums[i];
            }
        }
        return nums[nums.length-1];  // [1,2,2,3]
    }  */

        // priorityQueue - minHeap TC = O(nlogK) Sc = O(k)
   /* public int thirdMax(int[] nums) {
        PriorityQueue<Integer> maximums = new PriorityQueue<>(3);


        maximums.add(nums[0]);
        maximums.add(nums[1]);
        maximums.add(nums[2]);
        for(int i=3;i<nums.length;i++){
            if(nums[i]>maximums.peek()){
                maximums.poll();
                maximums.add(nums[i]);
            }
        }
        return maximums.poll();
    }  */

        public static int thirdMax(int[] nums){
            long largest = -2147483649l;
            long secondLargest = -2147483649l;
            long thirdLargest = -2147483649l;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>largest){
                    thirdLargest=secondLargest;
                    secondLargest = largest;
                    largest=nums[i];
                }
                else if(nums[i]>secondLargest && nums[i]!=largest){
                    thirdLargest=secondLargest;
                    secondLargest=nums[i];
                }
                else if(nums[i]>thirdLargest && nums[i]!=secondLargest && nums[i]!=largest){
                    thirdLargest=nums[i];
                }
            }
            if(thirdLargest==-2147483649l){ //49
                return (int)largest;
            }
            else{
                return (int) thirdLargest;
            }
        }




    public static void main(String[] args) {
        int[] arr = {1,2,-2147483648};
        System.out.println(thirdMax(arr));
    }


}
