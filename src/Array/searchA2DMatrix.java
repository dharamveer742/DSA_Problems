package Array;

public class searchA2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int expectedRow=-1;

        int rowLow=0;
        int rowMax=row-1;

      /* for(int i=0;i<row;i++){
           if(target>=matrix[i][0]  && target<= matrix[i][col-1]){
               expectedRow=i;
               break;
           }
       } */

        while(rowLow<=rowMax ){  // && rowLow>=0 && rowMax<row
            int mid =rowLow+(rowMax-rowLow)/2;
            System.out.println(rowLow+" "+rowMax+" "+mid);
            if(target>=matrix[mid][0] && target<=matrix[mid][col-1]){
                expectedRow=mid;
                break ;
            }
            else if(target>matrix[mid][col-1]){
                rowLow=rowLow+1;
            }
            else{
                rowMax=rowMax-1;
            }
        }

        if(expectedRow==-1){
            return false;
        }
        int low=0;
        int high=col-1;
        while(low<=high ){  // && low>=0 && high<col
            int mid = low+(high-low)/2;
            if(matrix[expectedRow][mid]==target){
                return true;
            }
            else if(target>matrix[expectedRow][mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] ar ={{1}};
        System.out.println(searchMatrix(ar,0));
    }


}
