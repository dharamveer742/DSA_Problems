package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _2kLargestElementsInArray {
    public static int[] Klargest(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int element:a){
            pq.add(element);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int index =0;
        int[] largest = new int[k];
        while(!pq.isEmpty()){
            largest[index]=pq.poll();
            index++;
        }
        return largest;

    }

    public static void main(String[] args) {
        int[] arr = {4,58,63,9,34};

        System.out.println(Arrays.toString(Klargest(arr,3)));
    }

}
// sort a k sorted Array