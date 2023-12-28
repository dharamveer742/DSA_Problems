package Basic;

/*
If the year satisfies either of the conditions, it's considered a leap year.
1. The year must be divisible by 400.
2. The year must be divisible by 4 but not 100.

 */


public class leapYear {
    public static void isLeap(int year){
        if (year % 400 == 0)
            System.out.println (year + " is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println (year + " is a Leap Year");

        else
            System.out.println (year + " is not a Leap Year");

    }

    public static void main(String[] args) {
        isLeap(2040);
    }
}
