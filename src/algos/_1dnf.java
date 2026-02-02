package algos;

public class dnf {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(k<=j){
            if(nums[k]==0){
                swap(i,k,nums);
                i++;
                k++;
            }
            else if(nums[k]==2){
                swap(k,j,nums);
                j--;
            }
            else{
                k++;
            }
        }
    }
    public void swap(int i, int j ,int[] arr){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
