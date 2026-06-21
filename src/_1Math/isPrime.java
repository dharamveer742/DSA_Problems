package _1BasicMath;

public class isPrime {

    public boolean checkPrime(int n) {
        if(n<=1) return false;
        for (int i = 2; i <n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // O(sqrtN)
    public static boolean check(int N ){
        if(N<=1) return false;
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }

    // recursive code  TC = O(N) SC = O(1) Tail recursion

    static Boolean checkPrime(int n, int i) {

        if (n < 2)
            return false;

        if (i == n)
            return true;


        if (n % i == 0)
            return false;


        return checkPrime(n, i+1);
    }

    public static boolean checkRecursive(int N, int i) {
        if (i * i > N) {
            return true;
        }

        if (N % i == 0) {
            return false;
        }

        return checkRecursive(N, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(check(16));
        System.out.println(checkPrime(29,2));
    }
}

