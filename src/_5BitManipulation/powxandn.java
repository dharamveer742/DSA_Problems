package BitManipulation;

public class powxandn {
    // given two integers x and n . we have to find x^n
    // -2^31<=n<=2^31-1   -2147483648  || if n is negative , and we convert into positive value it may give integer overflow  so use long datatype
    //  brute force approach :- multiply x n times TC = O(N)

    // optimised TC = O(log2N)  exponentiation by squaring

    public static double pow(double x,int n){
        long newN = n;
        if(newN<0){
            newN = -newN ;
            x=1/x;
        }
        double ans=1;
        while(n != 0){
            if((n & 1) != 0){
                ans *= x;
            }

            x *= x;
            n >>>= 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pow(2.02,4));
    }
}


