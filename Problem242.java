import java.util.ArrayList;

public class Problem242 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            ArrayList<String> chars = new ArrayList<>();
            for(int i=0;i<t.length();i++){
                if(!s.contains(t.charAt(i) + ""))
                    return false;
                chars.add(t.charAt(i) + "");
            }
            for(int i=0;i<s.length();i++){
                if(chars.contains(s.charAt(i) + "")){
                    chars.remove(chars.indexOf(s.charAt(i) + ""));
                }
                else{
                    return false;
                }
            }
            return true ;
        }
    }

}
