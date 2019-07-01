class Solution {
    public void sortColors(int[] nums) {
        int red=0,white=0,blue = 0;
        for(int i=0;i<nums.length;i++)
            switch(nums[i]){
                case 0:red++; break;
                case 1:white++;break;
                case 2:blue++; break;
            }
        
        for(int i=0;i<nums.length;i++)
            if(i<red)
                nums[i] = 0;
            else if(i<red+white)
                nums[i] = 1;
            else 
                nums[i] = 2;
    }
}
