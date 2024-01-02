package Stack;

import java.util.Stack;

public class postfixEvaluation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int op2 = st.pop();
                int op1= st.pop();
                st.push(op1+op2);
            }
            else if(tokens[i].equals("-")){
                int op2 = st.pop();
                int op1= st.pop();
                st.push(op1-op2);
            }
            else if(tokens[i].equals("*")){
                int op2 = st.pop();
                int op1= st.pop();
                st.push(op1*op2);
            }
            else if(tokens[i].equals("/")){
                int op2 = st.pop();
                int op1= st.pop();
                st.push(op1/op2);
            }
            else{
                int operand =  Integer.parseInt(tokens[i]);
                st.push(operand);
            }
        }
        return st.pop();

    }

}
