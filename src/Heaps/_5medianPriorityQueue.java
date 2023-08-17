package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class medianPriorityQueue {
    PriorityQueue<Integer> left ; // to store the max of n smaller elements
    PriorityQueue<Integer> right; // to store minimum of n largest elements

    // method to perform operations on medianPriorityQueue
    public  void median(){
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }
    public void add(int element){
        if(!right.isEmpty() && element>right.peek()){
            right.add(element);
        }
        else{
            left.add(element);
        }
        // balance both priorityQueues so the gap between then never become greater than 1
        if(left.size()- right.size()==2){
            right.add(left.remove());
        }
        if(right.size()- left.size()==2){
            left.add(right.poll());
        }
    }
    public int peek(){  // returns the median element in O(logN)
        if(left.isEmpty() && right.isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        else if(left.size()>=right.size()){   //  in even sized mpq we have to return left side element 1 [2] 3 4
            return left.peek();
        }
        else{
            return right.peek();
        }
    }
    public int poll(){
        if(left.isEmpty() && right.isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        else if(left.size()>=right.size()){
            return left.poll();
        }
        else{
            return right.poll();
        }
    }
    public int size(){
        return left.size()+right.size();
    }

    public static void main(String[] args) {
        medianPriorityQueue mpq = new medianPriorityQueue();
       mpq.median();
        mpq.add(1);
        mpq.add(2);
        mpq.add(3);
        System.out.println(mpq.peek());

    }

}
