package BasicMath.Striver;

public class _6CheckPrime {
    public boolean checkPrime(int n) {
        int cnt = 0;  // Initialize a counter variable to count the number of factors

        // Loop through numbers from 1 to n
        for (int i = 2; i <n; i++) {
            // If n is divisible by i without any remainder
            if (n % i == 0) {
                cnt++;  // Increment the counter
            }
        }

        // If the number of factors is exactly 2 (1 and the number itself), it's prime
        return cnt==0;
    }

    public boolean checkPrime2(int n) {
        int cnt = 0;  // Initialize a counter variable to count the number of factors

        // Loop through numbers from 1 to n
        for (int i = 2; i*i <=n; i++) {
            // If n is divisible by i without any remainder
            if (n % i == 0) {
                cnt++;  // Increment the counter
            }
        }

        // If the number of factors is exactly 2 (1 and the number itself), it's prime
        return cnt==0;
    }



}
