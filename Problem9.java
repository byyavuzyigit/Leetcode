public class Problem9 {
    public boolean isPalindrome(int x) {

        return recursiveCheck(Integer.toString(x));

    }


    public static boolean recursiveCheck(String str){

        //base case
        if(str.length()==0 || str.length()==1){
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)){
            return recursiveCheck(str.substring(1,str.length()-1));
        }

        else{
            return false;
        }

    }
}
