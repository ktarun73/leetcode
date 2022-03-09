class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] ar=new int[m+n];
        for(int i=0;i<m;i++){
            ar[i]=nums1[i];
        }
        int temp=0;
        for(int i=m;i<m+n;i++){
            ar[i]=nums2[temp];
            temp++;
        }
        Arrays.sort(ar);
        int arLen=ar.length;
        if(arLen%2==1){
            return (double)(ar[(int)arLen/2]);
        }
        int median=0;
        median=ar[arLen/2]+ar[(arLen/2)-1];
        return (double)median/2;
    }
}