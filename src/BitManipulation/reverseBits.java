package BitManipulation;

public class reverseBits {
    public static int reverseBitsOfNo(int number){
        int ans =0;
        for(int i=0;i<32;i++) {
            ans = ans << 1;
            int lastBit = number & 1;
            ans = ans | lastBit;
            number = number >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
       int reversed =  reverseBitsOfNo(43261596);   // 00000010100101000001111010011100
        System.out.println(reversed);   //  964176192
    }

}
