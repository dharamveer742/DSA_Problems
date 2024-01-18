package Basic;

public class isPrime {
    // O(sqrtN)
    public static boolean check(int N ){
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(16));
    }
}

// recursive code