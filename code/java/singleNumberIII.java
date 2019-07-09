class Solution {
    public int[] singleNumberIII(int[] nums) {
        if(nums.length == 2)
            return nums;
        List<String> s = new ArrayList<String>();
        int[] res = new int[2]; 
        for(int i=0;i<nums.length;i++)
            if(!s.contains(nums[i] + ""))
                s.add(nums[i] + "");
            else
                s.remove(nums[i] + "");
        
        res[0] = Integer.valueOf(s.get(0));
        res[1] = Integer.valueOf(s.get(1));
        return res;


    }
}
