package Basic;

public class armstrongNumber {

    // abcd… = an + bn + cn + dn + …
    //Where n is the order(length/digits in number)

    public static boolean isArmStrong(int num){
        int copy = num;
        int len = order(num);
        int sum=0;
        while(num>0){
            int lastDigit = num %10;
            int digit = (int) Math.pow(lastDigit,len);
            sum = sum+digit;
            num=num/10;

        }
        return sum == copy;

    }

    public static int order(int num){
        int len =0;
        while(num>0){
            len++;
            num=num/10;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(isArmStrong(407));
    }

}
