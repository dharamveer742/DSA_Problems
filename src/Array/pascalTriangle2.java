package Array;
import java.util.ArrayList;
import java.util.List;
public class pascalsTriangle {
// TC O(N^2) , SC O(N^2)
// print first n rows
    public static List<List<Integer>> pascal(int rows){

        List<List<Integer>>ans = new ArrayList<>();
        for(int i=0;i<rows;i++){
            List<Integer> al = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    al.add(1);
                }
                else{
                    int sum = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    al.add(sum);
                }
            }
            ans.add(al);
        }

        int i=0;
        while(i<ans.size()){
            int j=0;
            while(j<ans.get(i).size()){
                System.out.print(ans.get(i).get(j)+" ");
                j++;
            }
            System.out.println();
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        pascal(5);
    }
}
