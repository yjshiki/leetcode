class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int res = nums[0];
        int count = 1;
        int temp = 0;
        for(int i=1;i<nums.length;i++)
            if(nums[i]==nums[i-1])
                temp++;
            else{
                if(count<temp){
                    count = temp;
                    res = nums[i-1];
                }
                temp = 1;
            }
        if(count < temp)
            return nums[nums.length-1];
        
        return res;

    }
}
