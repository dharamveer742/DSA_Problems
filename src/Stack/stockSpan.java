package Stack;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Stack;

public class stockSpan {
    public static int[] stockSpan(int[] stock){
        Stack<Pair<Integer,Integer>> leftGreater = new Stack<>();

        int[] span = new int[stock.length];
        int index=0;
        for(int i=0;i<stock.length;i++){
            if(leftGreater.isEmpty()){
                span[index]=i-(-1);
                index++;
            }
            else if(!leftGreater.isEmpty() && leftGreater.peek().getKey()>stock[i]){
                span[index]=i-leftGreater.peek().getValue();
                index++;
            }
            else {
                while(!leftGreater.isEmpty() && leftGreater.peek().getKey()<=stock[i]){
                    leftGreater.pop();
                }
                if(!leftGreater.isEmpty() && leftGreater.peek().getKey()>stock[i]){
                    span[index]=i-leftGreater.peek().getValue();
                    index++;
                }
                else{
                    span[index]=i-1;
                    index++;
                }
            }
            leftGreater.push(new Pair(stock[i],i));
        }
        return span;
    }

    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,75,85};
        int[] ans = stockSpan(stocks);
        System.out.println(Arrays.toString(ans));
    }
}
// 100 80 60 70 60 75 85
// 1 1 1 2 1 4 6



