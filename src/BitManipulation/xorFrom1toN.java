package BitManipulation;

public class xorFrom1toN {
    public static int compute(int n){
        int x = n%4;
        int ans =0;
        if(x==0){
            ans= n;
        }
        else if(x==1){
            ans= 1;
        }
        else if(x==2){
            ans= n+1;
        }
        else if(x==3){
            ans= 1;
        }
        return ans;
    }
}
