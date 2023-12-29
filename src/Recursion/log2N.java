package Recursion;
import java.util.*;
public class log2N {

    public static int log(int num){
        int a =10;
        if(num==1){
            return 0;
        }
        return  1+log(num/2);
    }

    public static void main(String[] args) {
        // in built method
        System.out.println((int)(Math.log(64) / Math.log(2)));

        System.out.println(log(64));
        logIterative(64);
    }

    public static void logIterative(int num){
        int count =0;
        while(num>1){
            num=num/2;
            count++;
        }
        System.out.println(count);
    }




}
