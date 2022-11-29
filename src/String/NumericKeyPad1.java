// Input : GEEKSFORGEEKS
//Output : 4333355777733366677743333557777


package String;

public class NumericKeyPad1 {

    public static void equivalentNumeric(String sentence){
        String[] output={
                         "2","22","222",
                         "3","33","333",
                         "4","44","444",
                         "5","55","555",
                         "6","66","666",
                         "7","77","777","7777",
                         "8","88","888",
                         "9","99","999","9999"
                        };
        String ans = new String();
        for(int i=0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
               ans+='0';
            }
            else{
                ans+=output[sentence.charAt(i)-'A'];
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String input ="GEEKS FOR GEEKS";
        equivalentNumeric(input);
    }

}
