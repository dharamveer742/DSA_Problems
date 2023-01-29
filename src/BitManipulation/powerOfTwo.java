package BitManipulation;

public class powerOfTwo {
    public static boolean isPowerOfTwo(int no){
        if(no==0) return false;
        return (no&no-1)==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(10));
    }


    
}
