class Solution {
    public List<Integer> majorityElementII(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums.length == 0)
            return res;
        if(nums.length == 1){
            res.add(nums[0]);
            return res;
        }
        if(nums.length == 2){
            res.add(nums[0]);
            if(nums[0] != nums[1])
                res.add(nums[1]);
            return res;
        }

        Arrays.sort(nums);
        int i = 0;
        int j;
        while(i<nums.length-1){
            if(nums[i] == nums[i+1]){
                j = i + 1;
                while(nums[j] == nums[j-1]){
                    if(j == nums.length - 1){
                        j = j+1;
                        break;
                    }
                    j = j + 1;
                }
                if(j - i > nums.length / 3 && res.contains(nums[i]) == false)
                    res.add(nums[i]);
                i = j;
            }
            else
                i++;
        }
        return res;

    }
}
