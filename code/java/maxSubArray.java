class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>0)
                nums[i] += nums[i-1];
            if(nums[i] > res)
                res = nums[i];
        }
        return res;
    }
}
