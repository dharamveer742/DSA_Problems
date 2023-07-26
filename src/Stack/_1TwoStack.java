package Stack;

public class _1TwoStack {
    int[] arr;
    int size;
    int top1;
    int top2;

    public _1TwoStack(int size){
        this.size=size;
        arr = new int[size];
        top1=-1;
        top2=size;
    }

    public  void stack1Push(int val){
        if(top1>=top2-1){
            System.out.println("stack1 overflow");
            return;
        }
        top1++;
        arr[top1]=val;
    }
    public  int stack1Pop(){
        if(top1==-1){
            System.out.println("stack1 underflow");
            return -1;
        }
        int popped = arr[top1];
        top1--;
        return popped;
    }
    public int stack1Peek(){
        if(top1==-1){
            System.out.println("stack1 underflow");
            return -1;
        }
        return arr[top1];
    }
    public  void stack2Push(int val){
       if(top2-1<=top1){
           System.out.println("stack2 overflow");
           return ;
       }
       top2--;
       arr[top2]=val;
    }
    public int stack2Pop(){
        if(top2==size){
            System.out.println("stack2 underflow");
            return -1;
        }
        int popped = arr[top2];
        top2++;
        return popped;
    }
    public int stack2Peek(){
        if(top2==size){
            System.out.println("stack2 underflow");
            return -1;
        }
        return arr[top2];
    }

    public static void main(String[] args) {
        _1TwoStack st = new _1TwoStack(5);
        st.stack1Push(5);
        st.stack1Push(10);
        st.stack1Push(15);
        st.stack2Push(25);
        st.stack2Push(20);
        st.stack2Push(100);



    }

}
