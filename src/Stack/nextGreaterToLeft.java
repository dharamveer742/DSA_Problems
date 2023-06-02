package Stack;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterToLeft {
    public static int[] next(int[] arr){
        Stack<Integer> greater = new Stack<>();
        int[] ans = new int[arr.length];
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(greater.isEmpty()){
                ans[index]=-1;
                index++;
            }
            else if(!greater.isEmpty() && greater.peek()>arr[i]){
                ans[index]=greater.peek();
                index++;
            }
            else{
                while(!greater.isEmpty() && greater.peek()<=arr[i]){
                    greater.pop();
                }
                if(!greater.isEmpty()){
                    ans[index]=greater.peek();
                }
                else{
                    ans[index]=-1;
                }
                index++;
            }
            greater.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3};
        int[] ans = next(arr);
        System.out.println(Arrays.toString(ans));
    }
}

// [1,5,2,8,3]
// [-1,-1,5,-1,8]