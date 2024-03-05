public class Problem1750 {
        public int minimumLength(String s) {

            if(s.length() != 0 && s.length() != 1){
                while(s.charAt(0) == s.charAt(s.length()-1)){
                    int limit1 = findPrefix(s);
                    s = s.substring(limit1+1);
                    int limit2 = findSuffix(s);
                    s = s.substring(0,limit2);
                    if(s.length()==0 || s.length() == 1)
                        break;
                }
            }

            return s.length();
        }
        private static int findPrefix(String str){
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i) != str.charAt(i+1))
                    return i;
            }
            return 0;
        }
        private int findSuffix(String str){
            for(int i=str.length()-1;i>=1;i--){
                if(str.charAt(i) != str.charAt(i-1))
                    return i;
            }
            return 0;
        }

}
