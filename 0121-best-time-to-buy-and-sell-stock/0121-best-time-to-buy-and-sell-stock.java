class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buying_stock=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<=buying_stock){
                buying_stock=prices[i];
                continue;
            }
            profit=Math.max(profit,prices[i]-buying_stock);
        }
        return profit;
    }
}