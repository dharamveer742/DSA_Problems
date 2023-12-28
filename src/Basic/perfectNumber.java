package Basic;

public class perfectNumber {
    // sum of all factors of a number except the number itself is equal to  number

    // ex -16 => 1+2+4+8 =  15!=16  so 16 is not a perfect number


    public static boolean isPerfect(int n) {
        int sum = 0;

        for(int i = 1; i*i<=n; i++)
        {
            if (n % i == 0)
            {

                if(i == 1)
                    sum = sum + i;

                else if(i == n/i)
                    sum = sum + i;


                else
                    sum = sum + i + n/i;
            }
        }
        return sum == n;

    }

    public static void main(String[] args) {
        System.out.println(isPerfect(25));
    }
}
