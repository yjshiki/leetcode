class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        List<String> keys = new ArrayList<String>();
        String str;
        for(int i=0;i<strs.length;i++){
            str = wordChange(strs[i]);
            if(!map.containsKey(str)){
                List<String> lst = new ArrayList<String>();
                lst.add(strs[i]);
                map.put(str,lst);
                keys.add(str);
            }
            else{
                List<String> lst = map.get(str);
                lst.add(strs[i]);
                map.replace(strs[i],lst);
            }       
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for(int i=0;i<keys.size();i++)
            res.add(map.get(keys.get(i)));
        return res;
    }
    
    public String wordChange(String str){
        if(str.length() == 0)
            return "";
        Character[] temp = new Character[str.length()];
        for(int i=0;i<str.length();i++)
            temp[i] = str.charAt(i);
        Arrays.sort(temp);
        String res = "";
        for(int i=0;i<temp.length;i++)
            res += temp[i];
        return res;
    }
}
