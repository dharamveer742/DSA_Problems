package DP;
// Dp Solution -> TC O(N)
public class fibonacciNumber{
    public static int NthfibonacciNumber(int N) {
        int[] fibNumbers =new int[N + 1];
        fibNumbers[0]=0;
        fibNumbers[1]=1;
        for(int i=2;i<=N;i++){
            fibNumbers[i]=fibNumbers[i-1]+fibNumbers[i-2];
        }

        return fibNumbers[N];
    }
    public static void main(String[] args) {
        System.out.println(NthfibonacciNumber(6));
    }
}

//optimal subStructure
// Overlapping subProblem