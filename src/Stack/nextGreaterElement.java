package Stack;

import java.util.Stack;

public class nextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        Stack<Long> st = new Stack<>();
        long[] ans = new long[arr.length];
        for(int i =arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else if(st.peek()>arr[i]){
                ans[i]=st.peek();
            }
            else if(arr[i]>=st.peek()){
                while(!st.isEmpty() && arr[i]>=st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans[i]=st.peek();
                }
                else{
                    ans[i]=-1;
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
