package BitManipulation;

public class powerOfTwo {

    // Naive Approach O(log2N)
        public static boolean isPowerOfTwo1(int n) {

            if(n<=0){
                return false;
            }
            while(n>1){
                if(n%2 == 1){
                    return false;
                }
                n=n/2;
            }
            return true;
        }

 // optimised Approach O(1)
    public static boolean isPowerOfTwo2(int no){
        if(no<=0) return false;
        return (no&no-1)==0;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo1(16));
    }


    
}
