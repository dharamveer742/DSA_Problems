package Stack;
import java.util.Stack;
public class removeKDigits {
    public static String helper(String num,int k){
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<num.length()){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(helper("14301620",4));
    }
}
