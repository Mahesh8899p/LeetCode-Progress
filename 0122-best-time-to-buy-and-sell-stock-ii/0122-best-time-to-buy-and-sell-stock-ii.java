class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length - 1;
        int maximumprofit = 0;
        for(int i = 0;i<n;i++){
            if(prices[i+1] > prices[i]){
                maximumprofit += prices[i+1] - prices[i];
            }
        }
        return maximumprofit;
    }
}