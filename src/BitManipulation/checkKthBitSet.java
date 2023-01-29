package BitManipulation;

public class checkKthBitSet {
    public static void isSet(int N, int K){
        int mask = 1<< K-1;
        if((N & mask)!=0){
            System.out.println(K+"th Bit is set");
        }
        else{
            System.out.println(K+"th Bit is not set");
        }
    }

    public static void main(String[] args) {
        isSet(5,1);
    }

}
