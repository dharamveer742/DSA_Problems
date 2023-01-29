package BitManipulation;

public class countSetBits {
    public static int count(int N){
        int count =0;
        int mask =1;
        for(int i=1;i<32;i++){
            if((N & mask)!=0){
                count++;
            }
            mask = mask<<1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(5));
    }
}
