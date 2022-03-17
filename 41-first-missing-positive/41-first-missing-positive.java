class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean one=false;
        for(int i=0;i<n;i++){
            if(nums[i]<1||nums[i]>n){
                nums[i]=1;
            }
            else if(nums[i]==1){
                one = true;
            }
        }
        if(one==false){
            return 1;
        }
        for(int i=0;i<n;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                continue;
            }
            nums[Math.abs(nums[i])-1]*=-1;
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        
        return n+1;
    }
}