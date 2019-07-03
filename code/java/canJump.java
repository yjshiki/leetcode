class Solution {
    public boolean canJump(int[] nums) {
        int i = -1;
        int reach = 0;
        for(;i<nums.length && i < reach;){
            i++;
            if(reach >= nums.length - 1)
                return true;
            reach = Math.max(i+nums[i],reach);
        }
        return false;
    }
}
