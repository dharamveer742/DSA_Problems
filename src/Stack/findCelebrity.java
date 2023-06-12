package Stack;

import java.util.Stack;

public class findCelebrity {
    public static int celebrity(int[][] mat){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<mat.length;i++){
            st.push(i);
        }
        while(st.size()>=2){
            int firstLast=st.pop();
            int secondLast=st.pop();
            if(mat[firstLast][secondLast]==1){
                st.push(secondLast);
            }
            else{
                st.push(firstLast);
            }
        }
        int potentialCelebrity = st.pop();
        for(int i=0;i< mat.length;i++){
            if(i!=potentialCelebrity) {
                if (mat[i][potentialCelebrity] == 0 || mat[potentialCelebrity][i] == 1) return -1;

            }
        }
        return potentialCelebrity;
    }
    public static void main (String[] args){
        int[][] mat = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0} };
        System.out.println(celebrity(mat));
    }

}
