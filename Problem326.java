public class Problem326 {
    public boolean isPowerOfThree(int n) {

        if(n==1)
            return true;

        if(n>0){
            while(n%3==0){
                if(n%3==0){
                    n = n/3;
                }
                if(n==1){
                    return true;
                }
            }
        }

        return false;
    }
}
