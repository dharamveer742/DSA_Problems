package _1BasicMath.Striver;

public class _6CheckPrime {
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
}
