package Solution;

import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int l = nums.length-1;
        int s = 0;
        //find the expected values
        int[] nums2 = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums2);
        while(1==1){
            if(nums2[s] + nums2[l] == target)
                break;
            else if(nums2[s] + nums2[l] < target)
                s++;
            else
                l--;
        }
        //find the index
        int flag = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] == nums2[s]){
                ans[0] = i;
                flag += 1;
            }
            if(nums[nums.length -1 - i] == nums2[l] ){
                ans[1] = nums.length -1 - i;
                flag += 1;
            }
            
            if(flag == 2)
                break;

        }
        
        return ans;
    }
}
