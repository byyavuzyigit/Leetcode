public class Problem1672 {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int[] money = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                money[i] += accounts[i][j];
            }
            if(money[i] > max){
                max = money[i];
            }
        }

        return max;
    }
}
