class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length <= 2)
            return true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1])
                return helper(nums,i,i+1) || helper(nums,i+1,i);
        }
        return true;
    }
    
    public boolean helper(int[] nums,int k,int j){
        int tmp = nums[k];
        nums[k] = nums[j];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                nums[k] = tmp;
                return false;
            }
        }
        return true;
    }
}

