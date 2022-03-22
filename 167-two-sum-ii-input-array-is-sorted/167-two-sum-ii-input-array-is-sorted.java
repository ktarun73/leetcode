class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                int[] ar={++i,++j};
                return ar;
            }
            if(sum>target){
                j--;
            }
            else{
                i++;
            }
            
        }
        return null;
    }
}