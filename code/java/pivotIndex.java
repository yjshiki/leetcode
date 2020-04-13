class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0)
            return -1;
        int left = 0;
        int right = 0;
        for(int i=0;i<nums.length;i++)
            right = right + nums[i];
        
        for(int i=0;i<nums.length;i++){
            if(right == left + nums[i])
                return i;
            left += nums[i];
            right -= nums[i];
        }
        return -1;
    }
}
