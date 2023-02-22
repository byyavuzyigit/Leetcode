public class Problem699 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                    stones = stones.substring(0,j) + stones.substring(j);
                }

            }
        }
        return count;
    }
}
