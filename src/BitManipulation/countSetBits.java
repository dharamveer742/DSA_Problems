package BitManipulation;

public class countSetBits {
    // Brute force solution
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
    // optimised Solution (Brian kernighan algorithm)
    public static int countSetBits(int no){
        int count = 0;
        while(no>0){
            no = no & no-1;
            count ++;
        }
        return count ;
    }
    // 0(1) if not consider preprocessing(for look up table)
    public static int setBits(int no){
        int[] table = new int[256];   // dp array   the largest value that can be formed with 8 bits is 255
        table[0]=0;
        for(int i=1;i<256;i++){
            table[i]=(i&1)+table[i/2];
        }
        int res = 0;
        res = res + table[no & 0xff]; // f= 1111   adding the no of set bits in last eight bits
        no=no>>8;
        res =  res + table[no & 0xff];
        no=no>>8;
        res =res + table[no & 0xff];
        no=no>>8;
        res = res + table[no & 0xff];
        return res;
    }
    public static void main(String[] args) {
        System.out.println(setBits(0));
    }
}
