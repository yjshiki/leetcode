class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0)
            return 1;
        Arrays.sort(nums);
        int index = 0;
        while(index < nums.length)
            if(nums[index] == 1)
                break;
            else
                index++;
        //System.out.println(index);
        if(index == nums.length)
            if(nums[index-1] != 1)
                return 1;
            else
                return 2;
        for(int i=index;i<nums.length-1;i++)
            if(nums[i+1]-nums[i] > 1)
                return (nums[i] + 1);
        return (nums[nums.length-1] + 1);
    }
}
