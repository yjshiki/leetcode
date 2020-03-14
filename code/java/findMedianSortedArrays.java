class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int t1 = 0,t2=0;
        int length = nums1.length + nums2.length;
        int a,b;
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length)
                a = nums1[i];
            else
                a = Integer.MAX_VALUE;
            if(j<nums2.length)
                b = nums2[j];
            else
                b = Integer.MAX_VALUE;
            if(a<b)
                t1 = nums1[i++];
            else
                t1 = nums2[j++];
            if(length % 2 == 1){
                if(i+j == length/2 + 1)
                    return Double.valueOf(t1);
            }
            else{
                if(i+j == length/2 + 1)
                    return Double.valueOf(t1+t2)/2;
            }
            t2 = t1;
        }
        return -1;
    }
}
