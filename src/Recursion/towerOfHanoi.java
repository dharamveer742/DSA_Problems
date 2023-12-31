package Recursion;

public class towerOfHanoi {

    public static void tower(String source, String destination, String helper,int n){
        if(n==1){
            System.out.println("moving plate "+n +" from " + source + " to "+destination );
            return;
        }
        tower(source,helper,destination,n-1);
        System.out.println("moving plate "+n +" from " + source + " to "+destination );
        tower(helper,destination,source,n-1);
    }

    public static int towerSteps(String source, String destination, String helper,int n){
        if(n==1){
            System.out.println("moving plate "+n +" from " + source + " to "+destination );
            return 1;
        }
        int steps = 0;
        steps += towerSteps(source,helper,destination,n-1);
        System.out.println("moving plate "+n +" from " + source + " to "+destination );
        steps++;
        steps+=towerSteps(helper,destination,source,n-1);
        return steps;
    }

    public static void main(String[] args) {

        tower("source","destination","helper",3);
        System.out.println();
        int n = towerSteps("source","destination","helper",3);
        System.out.println(n);
    }

}
