package Array;

/*   Input: nums = [10,5,2,6], k = 100
Output: 8  */

public class subArrayProduct {
    public static int countSub(int[] nums,int k){
        int left=0;int right=0;
        int prod=1;
        int count=0;
        while(right<nums.length){
            prod=prod*nums[right];
            while(left< nums.length && prod>=k){
                prod=prod/nums[left++];
            }
            count+=right-left+1;
            right++;
        }
        return  count;
    }

    public static void main(String[] args) {
        int[] elements= {1,2,3,4};
        System.out.println(countSub(elements,100));
    }

}
