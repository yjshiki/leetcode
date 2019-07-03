class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        if(m==0){
            for(int p=0;p<n;p++)
                nums1[p] = nums2[p];
            return;
        }

        
        int[] nums3 = new int[m+n];
        int i = 0;
        int j = 0;
        int index = 0;
        int num1,num2;
        int num0 = Math.max(nums1[m-1],nums2[n-1]);
        while(i < m || j < n){
            if(i < m)
                num1 = nums1[i];
            else
                num1 = num0 + 1 ;
                
            if(j<n)
                num2 = nums2[j];
            else
                num2 = num0 + 1;
 
            if (num1 < num2){
                nums3[index] = num1;
                index++;
                i ++;
            }
            else{
                nums3[index] = num2;
                index++;
                j++;
            }
            
        }
        for(int p=0;p<m+n;p++)
            nums1[p] = nums3[p];
        
    }
}
