public class Problem28 {
    public int strStr(String haystack, String needle) {

        int occurrence = -1;

        if(haystack.length() < needle.length())
            return -1;

        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){

                if(i+needle.length()>haystack.length())
                    return -1;

                if(haystack.substring(i,i+needle.length()).equals(needle))
                    return i;
            }
        }

        return occurrence;
    }
}
