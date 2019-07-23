class Solution {
    public List<String> commonChars(String[] A) {
        Map<String,int[]> map = new HashMap<String,int[]>();
        List<String> res = new ArrayList<String>();
        for(int i=0;i<A[0].length();i++)
            if(!map.containsKey(A[0].substring(i,i+1))){
                int[] temp = new int[A.length]; 
                temp[0] = 1;
                map.put(A[0].substring(i,i+1),temp);
            }
            else{
                int[] temp2 = map.get(A[0].substring(i,i+1));
                temp2[0] += 1;
                map.replace(A[0].substring(i,i+1),temp2);
            }

        for(int i=1;i<A.length;i++)
            for(int j=0;j<A[i].length();j++)
                if(map.containsKey(A[i].substring(j,j+1))){
                    int[] temp2 = map.get(A[i].substring(j,j+1));
                    temp2[i] += 1;
                    map.replace(A[i].substring(j,j+1),temp2);
            }
        
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			int[] temp2 = map.get(key);
            int min = temp2[0];
            for(int i=0;i<temp2.length;i++)
                if(min>temp2[i])
                    min = temp2[i];
            while(min>0){
                res.add((String)key);
                min--;
            }
		}
        return res;
    }
}
