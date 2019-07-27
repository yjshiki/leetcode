class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        List<Integer>[] bucket = new List[nums.length+1];
        List<Integer> res = new ArrayList<Integer>();
        for(int num:nums)
            map1.put(num,map1.getOrDefault(num,0)+1);
        
        for(int key : map1.keySet()){
            int fre = map1.get(key);
            if(bucket[fre] == null)
                bucket[fre] = new ArrayList<Integer>();
            bucket[fre].add(key);
        }
        int i = nums.length;
        int count = 0;
        while(i > 0){
            if(bucket[i] != null)
                res.addAll(bucket[i]);
            if(res.size() >= k)
                break;
            i--;
        }
        return res;
    }
}
