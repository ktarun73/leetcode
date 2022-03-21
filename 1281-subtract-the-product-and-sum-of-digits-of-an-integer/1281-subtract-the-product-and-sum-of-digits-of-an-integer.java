class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int temp=n;
        while(temp>0){
            int temp2=temp%10;
            sum+=temp2;
            product*=temp2;
            temp/=10;
        }
        
        return product-sum;
    }
}