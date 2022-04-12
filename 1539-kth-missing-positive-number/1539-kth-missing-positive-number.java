class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] freq=new int[1001];
        
        for(int i:arr){
            freq[i]++;
        }
        
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                k--;
            }
            if(k==0){
                return i;
            }
        }
        return 1000+k;
    }
}