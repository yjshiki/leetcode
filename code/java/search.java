class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int mid;
        if (nums.length == 0)
            return -1;
        
        while(l < h){
            mid = (h+l)/2;
            if(nums[mid] > nums[h])
                l = mid + 1;
            else
                h = mid;
        }
        
        int MIN = l;
        
        if(target >= nums[0]){
            l = 0;
            h = MIN;
            while(l<h){
                mid = (l+h)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] > target)
                    h = mid;
                else
                    l = mid + 1;
            }
            if(nums[l] == target)
                return l;
        }

        if(target <= nums[nums.length-1]){
            l = MIN;
            h = nums.length-1;
            while(l<h){
                mid = (l+h)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] > target)
                    h = mid;
                else
                    l = mid + 1;
            }
            if(nums[l] == target)
                return l;
        }        
        
        return -1;
    }
}
