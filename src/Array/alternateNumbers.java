package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class alternateNumbers {
    public static int[] alternateNumbers(int []a) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int[] ans = new int[a.length];

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                positives.add(a[i]);
            }
            else{
                negatives.add(a[i]);
            }
        }

        if(positives.size()>negatives.size()){
            for(int i=0;i<negatives.size();i++){
                ans[2*i]=positives.get(i);
                ans[2*i]=negatives.get(i);
            }
            int index = 2*negatives.size();
            for(int i=negatives.size();i<positives.size();i++){
                ans[index]=positives.get(i);
                index++;
            }
        }
        else{
            for(int i=0;i<positives.size();i++){
                ans[2*i]=positives.get(i);
                ans[2*i+1]=negatives.get(i);
            }
            int index = 2*positives.size();
            for(int i=positives.size();i<negatives.size();i++){
                ans[index]=negatives.get(i);
                index++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
       int[] a = {1, 2, -3, -1, -2, 3};
        System.out.println(Arrays.toString(alternateNumbers(a)));
    }

}
