package Stack;

import java.util.Stack;

public class _2deleteMiddleElement {
    public static void delete(Stack<Integer> inputStack,int count,int N){
        if(inputStack.isEmpty()){
            return;
        }
        if(count==N/2){
            inputStack.pop();
            return;
        }
        int top= inputStack.pop();
        delete(inputStack, count+1, N);
        inputStack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);


        delete(st,0,st.size());
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
