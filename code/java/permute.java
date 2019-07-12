class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return res;
        List<Integer> lst = new ArrayList<Integer>();
        List<List<Integer>> temp = new ArrayList<List<Integer>>();
        List<List<Integer>> newRes = new ArrayList<List<Integer>>();
        lst.add(nums[0]);
        res.add(lst);
        if(nums.length == 1){
            return res;
        }

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<res.size();j++){
                temp = helper(res.get(j),nums[i]);
                for(int q=0;q<temp.size();q++)
                    newRes.add(temp.get(q));
                
            }
            res = newRes;
            newRes = new ArrayList<List<Integer>>();
            
        }
        return res;
    }
    
    public List<List<Integer>> helper(List<Integer> lst, int num){
        List<List<Integer>> A = new ArrayList<List<Integer>>();
        List<Integer> B = new ArrayList<Integer>();
        for(int i=0;i<lst.size();i++){
            for(int j =0;j<lst.size();j++){
                if(i==j)
                    B.add(num);
                B.add(lst.get(j));
            }
            A.add(B);
            B = new ArrayList<Integer>();
        }
        lst.add(num);
        A.add(lst);
        return A;
    }
}
