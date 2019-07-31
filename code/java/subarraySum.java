class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int j =  i;
            int count = nums[i];
            while(true){
                if(count ==  k)
                    res += 1;
                j = j + 1;
                if(j  == nums.length)
                    break;
                count = count + nums[j];
            }
        }  
        return res;
    }
}
