class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Integer[] res = new Integer[nums.length];        
        for(int i=0;i<nums.length;i++)
            if(res[nums[i]-1] == null)
                res[nums[i]-1] = -1;
            else
                res[nums[i]-1] ++;
        int index = 0;
        for(int i=0;i<res.length;i++)
            if(res[i] != null)
                if(res[i] == 0)
                    res[index++] = i + 1;
        
        return Arrays.asList(res).subList(0,index);
    }
}
