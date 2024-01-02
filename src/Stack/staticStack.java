package Stack;

import java.util.Arrays;

public class staticStack {

    int[] arr ;
    int top;
    int capacity ;

    staticStack(int c){
        top=-1;
        capacity = c;
        arr = new int[capacity];
    }

    public void push(int val){
        if(top>=capacity-1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top--];
    }
    public int  peek(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top];
    }
    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public void printStack(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        staticStack st = new staticStack(4);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

    }




}


// 4  0 1 2 3