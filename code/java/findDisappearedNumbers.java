class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Integer[] res = new Integer[n];
        for(int i =1 ;i < n+1; i++)
            res[i-1] = i;
        for(int i = 0;i < n;i++){
            res[nums[i]-1] = 0;
        }
        int p = 0, q=0;
        while(q < n){
            if(res[q] != 0){
                res[p++] = res[q];
            }
            q++;
        }

        return (Arrays.asList(res)).subList(0,p);
    }
}
