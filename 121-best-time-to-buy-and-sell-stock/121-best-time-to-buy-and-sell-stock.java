class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int ar[]=new int[len];
        int max=prices[len-1];
        for(int i=len-1;i>=0;i--){
            if(prices[i]>max){
                max=prices[i];
            }
            ar[i]=max;
        }
        
        int maxProfit=0;
        for(int i=0;i<len;i++){
            int temp=ar[i]-prices[i];
            if(temp>maxProfit){
                maxProfit=temp;
            }
        }
        return maxProfit;
    }
}