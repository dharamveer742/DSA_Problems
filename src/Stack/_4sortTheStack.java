package Stack;

import java.util.Stack;

public class _4sortTheStack {
    // use another stack   O(N^2) for both
    public static void sort(Stack<Integer> input){
        Stack<Integer> temp = new Stack<>();
        while(!input.isEmpty()){
            int currentElement = input.pop();
            while(!temp.isEmpty() && temp.peek()>currentElement){
                int popped = temp.pop();
                input.push(popped);
            }
            temp.push(currentElement);
        }
        while(!temp.isEmpty()){
            input.push(temp.pop());
        }
    }

    private void insertTop(Stack<Integer> s, int topElement)
    {
        if (s.empty() || topElement < s.peek())
        {
            s.push(topElement);
            return;
        }

        int temp = s.pop();
        insertTop(s, topElement);
        s.push(temp);
    }

    public void sortStack(Stack<Integer> s)
    {
        if (!s.empty())
        {
            int topElement = s.pop();
            sortStack(s);
            insertTop(s, topElement);
        }
    }





    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(2);
        st.push(4);
        st.push(-1);
        System.out.println(st);
        sort(st);
        System.out.println(st);  // sorted in bottom to top order
        
    }


}


