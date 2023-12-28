package Basic;


// TC = O(logn)

public class strongNumber {

    // Fills factorials of digits from 0 to 9.
    public  void preCompute(int[] f)
    {
        f[0] = f[1] = 1;
        for (int i = 2; i<10; ++i)
            f[i] = f[i-1] * i;
    }


    boolean isStrong(int x)
    {
        int f[] = new int[10];
        preCompute(f);
        int factSum = 0;

        int temp = x;
        while (temp>0)
        {
            factSum += f[temp%10];
            temp /= 10;
        }

        return (factSum == x);
    }

    public static void main (String[] args)
    {

        strongNumber st = new strongNumber();
        int x = 145;
        System.out.println(st.isStrong(x));
    }
}
