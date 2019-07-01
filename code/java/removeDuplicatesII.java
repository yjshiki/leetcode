class Solution {
    public int removeDuplicatesII(int[] nums) {
        if(nums.length < 3)
            return nums.length;
        
        int temp = nums[0] - 1; 
        
        for(int i=0;i<nums.length-2;i++){
            if(nums[i+2] == nums[i+1] && nums[i] == nums[i+1])
                nums[i] = temp;
        }
        
        int j = 0;
        for(int i=0;i<nums.length;i++)
            if(nums[i] != temp){
                nums[j] = nums[i];
                j++;
            }
        
        return j;
        
    }
}
