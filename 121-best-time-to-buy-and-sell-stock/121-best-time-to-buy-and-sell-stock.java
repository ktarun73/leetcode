class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int[] maxPrices=new int[len];
        int maxPrice=prices[len-1];
        for(int i=len-1;i>=0;i--){
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
            }
            maxPrices[i]=maxPrice;
        }
        
        int maxProfit=0;
        for(int i=0;i<len;i++){
            int temp=maxPrices[i]-prices[i];
            if(maxProfit<temp){
                maxProfit=temp;
            }
        }
        return maxProfit;
    }
}