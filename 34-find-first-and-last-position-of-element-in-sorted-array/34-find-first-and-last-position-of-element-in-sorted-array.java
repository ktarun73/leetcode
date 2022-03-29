class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] ar={-1,-1};
        if(n==0) return ar;
        ar[0]=search(nums,target,true);
        ar[1]=search(nums,target,false);
        return ar;
    }
    
    public int search(int[] nums,int target,boolean isStart){
        int ans=-1;
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(isStart){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }   
}