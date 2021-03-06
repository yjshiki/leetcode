class Solution {
    public int climbStairs(int n) {
        int total = 0;
        int twos = 0;
        int num = n;
        
        if(n<=0)
            return 0;
        
        if(n<=3)
            return n;
        
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;
        for(int i=2;i<n;i++)
            nums[i] = nums[i-1] + nums[i-2];
        
        return nums[n-1];
    }
}
