class Problem387 {
    public int firstUniqChar(String s) {
        int index = -1;
        char x = 1;
        for(int i=0;i<s.length();i++){
            if('a' <= s.charAt(i) && 'z' >= s.charAt(i)){
                if(s.substring(i+1,s.length()).contains(s.charAt(i) + "")){
                    s = s.replaceAll(s.charAt(i) + "",x + "");
                    x++;
                }
                else{
                    return i;
                }
            }
        }
        return -1;
    }
}
