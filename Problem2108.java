class Problem2108 {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(isPalindrome(word))
                return word;
        }

        return "";
    }

    private static boolean isPalindrome(String s){
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        else
            return false;
    }
}
