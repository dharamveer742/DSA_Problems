package Basic;

public class findFactors {
    // TC = O(sqrtN)
    public static void find(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int fact1= i;
                int fact2 = n/fact1;
                if(fact2!=fact1){
                    System.out.println(fact1+" "+fact2);
                }
                else{
                    System.out.println(fact1);
                }
            }

        }
    }

    public static void main(String[] args) {
        find(16);
        findAscending(16);
    }

    // O(sqrtN)
    public static void findAscending(int num){
        int i;
        // to avoid double printing
        boolean flag = false;

        for(i = 1; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                System.out.print(i + " ");

            // To avoid double printing of equal pairs
            // Example (10,10) we only want to print once
            if(i == num/i)
                flag = true;
        }

        // if flag is true then we had double pairs like (10,10)
        // we should do i-- so as not to do double printing of pair divisor
        // doing i -=2 rather than i-- as in previous for loop we exited
        // with i++, example, i = 10 became 11 and we need to start with 9
        // so as to ignore 10 as its a double pair
        if(flag)
            i -= 2;

        // printing pairs
        for(; i >= 1; i--)
        {
            if (num % i == 0)
                System.out.print(num/i + " ");
        }
    }

}
