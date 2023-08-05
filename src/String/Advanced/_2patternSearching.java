package String.Advanced;

public class _2patternSearching {

    // naive approach O(n*m)
    public static void search(String text,String pattern){
        int n = text.length();
        int m = pattern.length();

        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
    // naive approach for distinct characters in pattern
    // text =  "abcabcd" pattern = "abcd"
    // op = 3

    public static void searchDistinct(String text,String pattern){
        int n = text.length();
        int m = pattern.length();
        int i=0;
        while(i<=n-m){
            int j=0;
            for(j=0;j<m;j++){
               if(text.charAt(i+j)!=pattern.charAt(j)){
                   break;
               }
            }
            if(j==m){
                System.out.print(i+" ");
            }
            if(j==0){
                i++;
            }
            else{
                i=i+j;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "llo";
        String s3 = "abcabcdabcd";
        String s4 = "abcd";
        searchDistinct(s3,s4);
    }

}
