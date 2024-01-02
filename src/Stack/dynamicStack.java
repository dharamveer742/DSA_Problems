package Stack;

public class dynamicStack {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    Node top;
    int size;

     dynamicStack(){
         size=0;
     }

     public void push(int val){
         Node newNode = new Node(val);
         if (top == null) {
             top=newNode;
         }
         else{
             newNode.next=top;
             top =  newNode;
         }
         size++;
     }
     public int pop(){
         if(top==null){
             System.out.println("stack underfflow");
             return -1;
         }

         int popped = top.val;
         top=top.next;
         size = size-1;
         return popped;

     }
     public int peek(){
         if(top==null){
             System.out.println("stack underfflow");
             return -1;
         }
         return top.val;
     }

     public int size(){
         return size;
     }
     public boolean isEmpty(){
         return size==0;
     }


     public static void main(String[] args) {
        dynamicStack dst = new dynamicStack();

        dst.push(1);
        dst.push(2);

        dst.push(3);

        dst.pop();
        dst.pop();
        dst.pop();
        dst.pop();
        System.out.println(dst.peek());


    }






}
