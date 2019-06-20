class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2)
            return(nums.length);
        int i = 0;
        int index = 0;
        while(i<nums.length){
            if(nums[i] == nums[index])
                i++;
            else
                nums[++index] = nums[i++];
        }
        nums = Arrays.copyOfRange(nums, 0, index+1);
        return nums.length;
    }
}
