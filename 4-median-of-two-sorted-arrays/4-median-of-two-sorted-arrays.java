class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int ar[]=new int [m+n];
        for(int i=0;i<m;i++){
            ar[i]=nums1[i];
        }
        
        int temp=0;
        
        for(int i=m;i<m+n;i++){
            ar[i]=nums2[temp];
            temp++;
        }
        Arrays.sort(ar);
        
        
        double median=0;
        if(ar.length%2==1){
            int t=(int)ar.length/2;
            median=(double)ar[t];
        }
        else{
            int a=(int)ar.length/2;
            int b=(a-1);
            median=(double)(ar[a]+ar[b])/2;
        }
        return median;
        
    }
}