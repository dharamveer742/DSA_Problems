package BasicMath.Striver;

public class _1CountDigits {
    static int countDigits(int num){
        if(num==0) return 1;
        int count = 0;
        while(num!=0){
            num /= 10;
            count++;
        }
        return count;
    }

    static int countDigits2(int n) {

        int cnt = (int) (Math.log10(n) + 1);

        // The expression (int)(Math.log10(n) + 1)
        // calculates the number of digits in 'n'
        // and casts it to an integer.


        // Finally, the result is cast
        // to an integer to ensure it is rounded
        // down to the nearest whole number.

        return cnt;
    }

    public static void main(String[] args) {
        int N = 4;

        System.out.println(countDigits(N));
        int d = (int) Math.log10(105)+1;
        System.out.println(d);
    }
}
