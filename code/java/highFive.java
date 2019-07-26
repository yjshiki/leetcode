class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        int index = 0;
        for(int i=0;i<items.length;i++)
            if(!map.containsKey(items[i][0])){
                List<Integer> temp1 = new ArrayList<Integer>();
                temp1.add(items[i][1]);
                map.put(items[i][0],temp1);
                index++;
            }
            else{
                List<Integer> temp2 = map.get(items[i][0]);
                temp2.add(items[i][1]);
                map.replace(items[i][0],temp2);
            }
        int[][] res = new int[index][2];
        index = 0;
        for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
            List<Integer> temp3 = entry.getValue();
            Collections.sort(temp3);
            res[index][0] = entry.getKey();
            res[index][1] = (temp3.get(temp3.size()-5) + temp3.get(temp3.size()-4) + temp3.get(temp3.size()-3) + temp3.get(temp3.size()-2) + temp3.get(temp3.size()-1))/5;
            index++;
        }
        return res;
    }
}
