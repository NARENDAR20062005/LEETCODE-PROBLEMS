class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE,profit=0;

        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }

            profit= Math.max(profit,prices[i]-buy);
        }

        return profit;
    }
}