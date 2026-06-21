package Array;

public class removeDuplicatesFrom2 {

    public static int remove(int[] arr){
        int index=1;
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1] && count<2){
                arr[index]=arr[i];
                index++;
                count++;
            }
            else if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
                count=1;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(remove(arr));
    }
}
