public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        //base case
        for(int i=0;i<strs.length;i++){

            if(strs.length==1)
                return strs[i];

            if(strs[i].length()==0)
                return "";

        }

        boolean check = false;

        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(0)==strs[j+1].charAt(0)){
                    check = true;
                }
                else{
                    return "";
                }
            }
        }

        if(check){
            String[] str = new String[strs.length];
            for(int j=0;j<str.length;j++){
                str[j] = strs[j].substring(1);
            }
            return strs[0].charAt(0) + longestCommonPrefix(str);
        }
        return "";
    }
}
