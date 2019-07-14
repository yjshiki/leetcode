class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0)
            return 0;
        int i=0,j=0,res=nums.length + 1,sum=0;
        while(j<nums.length){
            sum += nums[j++];
            while(sum >= s){
                res = Math.min(res,j-i);
                sum -= nums[i++];
            }
        }
        if(res == nums.length + 1)
            return 0;
        return res;
    }
}
