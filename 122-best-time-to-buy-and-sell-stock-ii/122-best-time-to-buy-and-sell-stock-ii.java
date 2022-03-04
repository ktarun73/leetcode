class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int i=0;i<prices.length-1;i++){
            int j=i+1;
            if(prices[i]<prices[j]){
                maxProfit+=prices[j]-prices[i];
            }
        }
        return maxProfit;
    }
}