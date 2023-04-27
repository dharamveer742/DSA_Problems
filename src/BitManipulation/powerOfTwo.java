package BitManipulation;

public class powerOfTwo {

    // Naive Approach O(log2N)
    public static boolean isTwosPower(int no){
        if(no==0) return  false;
        while(no>1){
            if(no%2!=0){
                return  false;
            }
            no=no/2;
        }
        return true;
    }
 // optimised Approach O(1)
    public static boolean isPowerOfTwo(int no){
        if(no==0) return false;
        return (no&no-1)==0;
    }

    public static void main(String[] args) {

        System.out.println(isTwosPower(16));
    }


    
}
