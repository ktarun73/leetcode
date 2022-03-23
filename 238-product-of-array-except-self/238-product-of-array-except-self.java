class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroIndex=-1,zeroCount=0,product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroIndex=i;
                zeroCount++;
            }
            else{
                product*=nums[i];
            }
        }
        int[] ar=new int[nums.length];
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