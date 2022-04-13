class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] ar:grid){
            count=count+binarySearch(ar);
            
        // return count;
        }
        return count;
    }
    
    public int binarySearch(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        if(arr[start]<0) return n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<0 && arr[mid-1]>=0){
                return n-mid;
            }
            // if(arr[mid]>0 && ar[mid+1]<0){
            //     return 
            // }
            if(arr[mid]<0){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return 0;
    }
}