public class Problem121 {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int look = 0;
        int result = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            look = prices[i] - min;
            if(result<look)
                result = look;
        }

        return result;

    }
}
