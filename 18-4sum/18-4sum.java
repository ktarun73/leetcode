class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        if(n<4) return res;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int val1=nums[i];
            List<List<Integer>> subRes=threeSum(nums,target-val1,i+1);
            
            for(List<Integer> list:subRes){
                list.add(val1);
                res.add(list);
            }
            
        }
        return res;
    }
    
    public List<List<Integer>> threeSum(int[] nums,int target,int si){
        int n=nums.length-2;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=si;i<n;i++){
            if(i!=si && nums[i]==nums[i-1]){
                continue;
            }
            
            int val1=nums[i];
            List<List<Integer>> subRes=twoSum(nums,target-val1,i+1);
            
            for(List<Integer> list:subRes){
                list.add(val1);
                res.add(list);
            }
            
        }
        
        return res;
    }
    
    public List<List<Integer>> twoSum(int[] nums,int target,int si){
        int end=nums.length-1;
        int start=si;
        List<List<Integer>> res=new ArrayList<>();
        while(start<end){
            if(start!=si && nums[start]==nums[start-1]){
                start++;
                continue;
            }
            int sum=nums[start]+nums[end];
            List<Integer> subRes=new ArrayList<>();
            if(sum==target){
                subRes.add(nums[start]);
                subRes.add(nums[end]);
                res.add(subRes);
                start++;
                end--;
            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }
        }
        
        return res;
    }
}
















