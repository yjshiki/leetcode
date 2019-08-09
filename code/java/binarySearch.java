class Solution {
    public int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if(nums.length == 0)
            return -1;
        
        while(l < r){
            int mid = (l+r)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) l = mid + 1;
            else r = mid;
        }
        if(nums[l] == target)
            return l;
        else
            return -1;
    }
}
