package Array;

public class maximumProductSubArray {
    public static int  maxProduct(int[] nums){  // 2 2 3 -1
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min = Math.min(nums[i],Math.min(min*nums[i],max*nums[i]));
            max = temp;
            ans= Math.max(ans,max);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,-3,4,5};
        System.out.println(maxProduct(arr));
    }
}
