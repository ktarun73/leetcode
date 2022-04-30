class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(binarySearch(arr,arr[i]*2,i)){
                return true;
            }
        }
        return false;
    }
        public boolean binarySearch(int[] nums, int target, int index){
        int start = 0, N =nums.length, end = N-1, mid=0;
        while(start <= end){
             mid = start + (end - start)/2;
            if(nums[mid] == target && mid!=index) {
                    return true;
            }else if(target < nums[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return false;
    }

}