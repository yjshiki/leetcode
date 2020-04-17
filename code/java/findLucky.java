class Solution {
    public int findLucky(int[] arr) {
        if(arr.length == 0)
            return -1;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i]);
                map.replace(arr[i],temp,temp+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int res = -1;
        for(int key: map.keySet()){
            if(map.get(key) == key)
                res = Math.max(res,key);
        }
        return res;
    }
}
