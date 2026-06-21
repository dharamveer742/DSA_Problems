package _2Array.Striver.Easy;

public class _1checkIfArrayIsSortedAndRotated2 {
    public boolean check(int[] nums) {
        int n = nums.length;
        int cnt =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                cnt++;
            }
        }
        if(cnt==1 && nums[0]>nums[n-1]) return true;
        return cnt==0;
    }
}
