class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] ans=new int[2*len];
        int a=0;
        for(int i=0;i<ans.length;i++){
            if(i<len){
                ans[i]=nums[i];
                continue;
            }
            ans[i]=nums[a];
            a++;
        }
        return ans;
    }
}