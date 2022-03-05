class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0,zeroIndex=-1;
        int product=1;
        int ar[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
                zeroIndex=i;
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
        for(int i=0;i<nums.length;i++){
            ar[i]=product/nums[i];
        }
        return ar;
        
    }
}