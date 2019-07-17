class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int x = 0;x<Math.pow(2,n);x++){
            List<Integer> temp = new ArrayList<Integer>();
            String s = binToString(x,n);
            for(int j=0;j<s.length();j++)
                if(s.charAt(n-1-j) == '1')
                    temp.add(nums[j]);
            if(!res.contains(temp))
                res.add(temp);
        }
        return res;
           
    }
    
    public String binToString(int x,int n){
        String s = Integer.toBinaryString(x);
        int len = s.length();
        for(int i=0;i<n-len;i++)
            s = "0" + s;
        return s;
    }
}
