package _1BasicMath.Striver;

public class _3PalindromeNumber {
    public boolean isPalindrome(int x) {
        int temp =x;
        if(temp<0 || (temp!=0 && temp%10 ==0)) return false;
        int rev =0;
        while(temp>0){
            int lastDigit = temp%10;
            temp=temp/10;
            rev = (rev*10)+lastDigit;
        }
        return rev==x;
    }
    boolean isPalindromeOptimised(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int rev = 0;

        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return x == rev || x == rev / 10;
    }
}
