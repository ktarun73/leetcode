class Solution {
    public int majorityElement(int[] nums) {
        int me=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                me=nums[i];
                break;
            }
        }
        return me;
    }
}