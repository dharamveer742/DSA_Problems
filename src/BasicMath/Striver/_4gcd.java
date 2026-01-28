package BasicMath.Striver;

public class _4gcd {
    public static int findGCD(int a,int b){
        while(a!=0 && b!=0){
            if(a<b){
                b=b-a;
            }
            else if(a>b){
                a=a-b;
            }
        }
        if(a==0) return b;
        else return a;
    }

    // TC = O(max(a,b))   ex - {1000,1};

    // Instead of repeatedly subtracting the smaller number from the larger one, we use the modulus operation, which removes multiple subtractions in a single step
    public static int findGCDModulus(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //TC=O(log(min(a,b))


    public static int recursiveGCD(int a,int b){
        if(b==0) return a;
        return recursiveGCD(b,a%b);
    }


}
