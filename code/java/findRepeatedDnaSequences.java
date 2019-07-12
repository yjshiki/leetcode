class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> temp = new HashSet();
        Set<String> res = new HashSet();
        String substring;
        for(int i = 0;i<=s.length()-10;i++){
            substring = s.substring(i,i+10);
            if(temp.contains(substring))
                res.add(substring);
            else
                temp.add(substring);
        }    
        return new ArrayList(res);
    }
}
