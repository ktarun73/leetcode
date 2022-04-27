class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDif=Integer.MAX_VALUE;
        int min=0;
        for(int i=0;i<nums.length;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==target){
                    return sum;
                }
                if(sum>target){
                    if(minDif>(sum-target)){
                        minDif=sum-target;
                        min=sum;
                    }
                    end--;
                }
                else{
                    if(minDif>(target-sum)){
                        minDif=target-sum;
                        min=sum;
                    }
                    start++;
                }
            }
        }
        
        return min;
    }
}