class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i=1;i<nums.length;i++)
            res[i] = res[i-1] * nums[i-1];
        int temp = 1;
        for(int i=0;i<nums.length;i++){
            res[nums.length-1-i] *= temp;
            temp *= nums[nums.length-1-i];
        }
        return res;
    }
}
