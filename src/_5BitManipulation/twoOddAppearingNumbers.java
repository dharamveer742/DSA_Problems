package BitManipulation;

public class twoOddAppearingNumbers {

    // O(N^2)

    public static int[] find2OddAppearing(int[] numbers) {
        int[] result = new int[2];
        int idx = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) count++;
            }
            // Check if count is odd and not already added
            if (count % 2 != 0) {
                // Avoid duplicates in result
                if (idx == 0 || (idx == 1 && result[0] != numbers[i])) {
                    result[idx++] = numbers[i];
                    if (idx == 2) break; // Found both numbers
                }
            }
        }
        return result;
    }


    public static int[] twoOddAppearingNumber(int[] numbers){
        int xor =0;
        for(int i=0;i<numbers.length;i++){
            xor = xor^numbers[i];
        }
        // find position of  rightmost set bit in xor
        int rsb = xor&~(xor-1);               //  a number with only rightmost set bit
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
