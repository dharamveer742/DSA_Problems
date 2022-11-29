package String;
// listen  l = 109
public class anagram_2 {
    public boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] count = new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]=count[s1.charAt(i)]++;
            count[s2.charAt(i)]=count[s2.charAt(i)]--;
        }
        for(int i=0;i<s1.length();i++){
            if(count[s1.charAt(i)]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        anagram_2 ob = new anagram_2();
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(ob.isAnagram(s1,s2));
    }
}
