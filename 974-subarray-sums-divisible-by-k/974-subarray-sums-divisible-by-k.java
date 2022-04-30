class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int runningSum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            runningSum+=nums[i];
            int remainder=runningSum%k;
            if(remainder<0) remainder+=k;
            if(map.containsKey(remainder)){
                ans+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return ans;
    }
}