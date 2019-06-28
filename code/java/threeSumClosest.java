class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int p,q,temp;
        int dis = nums[0] + nums[1] + nums[2] - target;
        int res = dis + target;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            p = i +1;
            q = nums.length-1;
            while(p < q){
                temp = nums[i] + nums[p] + nums[q]-target;
                if(temp == 0)
                    return target;
                if(Math.abs(dis) > Math.abs(temp)){
                    dis = temp;
                    res = target + dis;
                }
                
                if(temp < 0)
                    p++;
                else if(temp > 0)
                    q--;
            }
        }
        return res;
        
    }
}
