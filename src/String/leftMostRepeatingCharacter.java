package String;

public class leftMostRepeatingCharacter {
    /*
    public int findLeftMostRepeating(String s){
        int[] count = new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]=count[s.charAt(i)]+1;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]>1){
                return i;
            }
        }
        return  -1;
    }
    */
    public int findLeftMostRepeating(String s){
        int res=-1;
        int[] count = new int[256];
        for(int i=s.length()-1;i>=0;i--){
            count[s.charAt(i)]=count[s.charAt(i)]+1;
            if(count[s.charAt(i)]>1){
                res=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        leftMostRepeatingCharacter ob = new leftMostRepeatingCharacter();
        String s ="asbcdbcbj";
        System.out.println((ob.findLeftMostRepeating(s)));
    }
}
