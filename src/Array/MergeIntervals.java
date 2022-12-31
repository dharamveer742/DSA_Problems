package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    public static int[][] mergeIntervals(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[] > ans = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                int[] re = {start,end};
                ans.add(re);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        int[] lastInterval = {start,end};
        ans.add(lastInterval);

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{4,6},{5,8}};
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }


}
