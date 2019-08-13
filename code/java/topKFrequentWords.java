class Solution {
    public List<String> topKFrequentWords(String[] words, int k) {
        //Arrays.sort(words);
        Map<String,Integer> map1 = new HashMap<String,Integer>();
        List<String>[] bucket = new List[words.length+1];
        List<String> res = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        for(String word:words)
            map1.put(word,map1.getOrDefault(word,0)+1);
        
        for(String key : map1.keySet()){
            int fre = map1.get(key);
            if(bucket[fre] == null)
                bucket[fre] = new ArrayList<String>();
            bucket[fre].add(key);
        }
        int i = words.length;
        int count = 0;
        while(i > 0){
            if(bucket[i] != null){
                temp = bucket[i];
                Collections.sort(temp);
                res.addAll(temp);
            }
            if(res.size() >= k)
                break;
            i--;
        }
        while(res.size() > k){
            int length = res.size();
            res.remove(length-1);
        }
            
        return res;        
    }
}
