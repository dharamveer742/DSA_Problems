package Stack;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Stack;

public class maximumAreaHistogram {
    public static int maximumArea(int[] heights){
        // nearest smaller left
        // nearest smaller right
        // width =  nearest smaller right - nearest smaller left
        // Area = current height * expanded width

        int[] nearestSmallerLeft = findNearestSmallerLeft(heights);
        int[] nearestSmallerRight = findNearestSmallerRight(heights);
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i< heights.length;i++){
            int width = (nearestSmallerRight[i]-nearestSmallerLeft[i])-1;
            int area =  heights[i]*width;
            maxArea=Math.max(maxArea,area);

        }
        return maxArea;



    }
    public static int[] findNearestSmallerLeft(int[] heights){
        Stack<Pair<Integer,Integer>> st = new Stack<>();
        int[] smallerLeft = new int[heights.length];
        int index=0;
        for(int i=0;i< heights.length;i++){
            if(st.isEmpty()){
                smallerLeft[index]=-1;
                index++;
            }
            else if(!st.isEmpty() && st.peek().getKey()<heights[i]){
                smallerLeft[index]= st.peek().getValue();
                index++;
            }
            else{
                while(!st.isEmpty() && st.peek().getKey()>=heights[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    smallerLeft[index]=st.peek().getValue();
                    index++;
                }
                else{
                    smallerLeft[index]=-1;
                    index++;
                }
            }
            st.push(new Pair(heights[i],i));
        }

        return smallerLeft;
    }
    public static int[] findNearestSmallerRight(int[] heights){
        Stack<Pair<Integer,Integer>> st = new Stack<>();
        int[] smallerRight = new int[heights.length];
        int index=heights.length-1;
        for(int i= heights.length-1;i>=0;i--){
            if(st.isEmpty()){
                smallerRight[index]= heights.length;
                index--;
            }
            else if(!st.isEmpty() && st.peek().getKey()<heights[i]){
                smallerRight[index]= st.peek().getValue();
                index--;
            }
            else{
                while(!st.isEmpty() && st.peek().getKey()>=heights[i]){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek().getKey()<heights[i]){
                    smallerRight[index]=st.peek().getValue();
                    index--;
                }
                else{
                    smallerRight[index]=heights.length;
                    index--;
                }
            }
            st.push(new Pair(heights[i],i));
        }
        System.out.println(Arrays.toString(smallerRight));
        return smallerRight;
    }

    public static void main(String[] args) {
        int[] blocks = {2,1,5,6,2,3};                               // [-1,-1,1,2,1,4]
        System.out.println("blocks  "+Arrays.toString(blocks));    //  [1,6,4,4,6,6]
        int ans = maximumArea(blocks);
        System.out.println(ans);
    }

}
