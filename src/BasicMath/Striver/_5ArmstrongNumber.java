package BasicMath.Striver;

public class _5ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int temp = num;
        int n = num;
        int k=0;
        while(num>0){
            num=num/10;
            k++;
        }

        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, k);
            n /= 10;
        }

        return sum == temp;
    }
}

// TC = O((log n)²)  CAN we optimise it using integer exponentiation
