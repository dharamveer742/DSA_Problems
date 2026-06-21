package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    public static ArrayList<ArrayList<Integer>> mergeIntervalsBF(int[][] intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int start =  intervals[i][0];
            int end = intervals[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)) continue;
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=end){
                    end = Math.max(end,intervals[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(new ArrayList<>(Arrays.asList(start,end)));
        }
        return ans;
    }

    public static int[][] mergeIntervals(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);  //  [3,4]  [2,6]  -> [3,6]  why sorting by interval's starting time
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
        //int[][] intervals = {{1,4},{4,6},{5,8}};
        int[][] intervals = {{3,4},{2,6}};
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }


}
