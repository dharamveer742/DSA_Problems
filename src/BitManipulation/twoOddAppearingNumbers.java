package BitManipulation;

public class twoOddAppearingNumbers {

    // O(N^2)

    public static int find2OddAppearing(int[] numbers){
        int ans = numbers[0];
        for(int i=0;i<numbers.length;i++){
            int count =0;
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]==numbers[i]) count++;
            }
            if(count ==1 || count%2!=0){
                ans = numbers[i];
                break;
            }
        }
        return ans;
    }

    public static int[] twoOddAppearingNumber(int[] numbers){
        int xor =0;
        for(int i=0;i<numbers.length;i++){
            xor = xor^numbers[i];
        }
        // find rightmost set bit in xor
        int rsb = xor&~(xor-1);
        int res1 =0;
        int res2 =0;
        // find the two groups (in one group elements this bit is set and in other it is unset)
        for(int i=0;i<numbers.length;i++){
            if((rsb&numbers[i])!=0){
                res1 = res1^numbers[i];
            }
            else{
                res2 = res2^numbers[i];
            }
        }
        int[] ans = {res1,res2};
        return  ans;
    }

    public static void main(String[] args) {
        int[] numbers = {3,4,3,4,8,4,4,32,7,7};
        int[] ans = twoOddAppearingNumber(numbers);
        System.out.println(ans[0]+" "+ans[1]);
    }

}
