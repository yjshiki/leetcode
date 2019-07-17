class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int res = nums[0];
        int[] nums1 = new int[nums.length];
        for(int i =0;i<nums.length;i++)
            nums1[i] = nums[i];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] !=0)
                nums[i] *= nums[i-1];
            if(nums[i] > res)
                res = nums[i];
        }
        res = Math.max(res,nums1[nums1.length-1]);
        for(int i=nums1.length-2;i>=0;i--){
            if(nums1[i+1] !=0)
                nums1[i] *= nums1[i+1];
            if(nums1[i] > res)
                res = nums1[i];
        }
        return res;
    }
}
