import java.util.ArrayList;

public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> sequence = new ArrayList<>();
        int max = 0;
        int look = 0;
        for(int i=0;i<s.length();i++){
            sequence.add(s.charAt(i));
            look++;
            for(int j=i+1;j<s.length();j++){
                if(!sequence.contains(s.charAt(j))){
                    sequence.add(s.charAt(j));
                    look++;
                }
                else{
                    break;
                }
            }
            if(look > max)
                max = look;
            look = 0;
            sequence.clear();
        }
        return max;
    }
}
