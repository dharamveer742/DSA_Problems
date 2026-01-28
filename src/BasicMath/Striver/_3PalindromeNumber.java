package BasicMath.Striver;

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
}
