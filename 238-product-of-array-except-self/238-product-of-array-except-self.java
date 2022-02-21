class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ar[]=new int[n];
        int product=1;
        int zeroIndex=-1,zeroCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeroIndex=i;
                zeroCount++;
            }
            else{
                product*=nums[i];
            }
        }
        if(zeroCount>1){
            return ar;
        }
        else if(zeroCount==1){
            ar[zeroIndex]=product;
            return ar;
        }
        else{
            for(int i=0;i<n;i++){
                ar[i]=product/nums[i];
            }
        }
        return ar;
    }
}