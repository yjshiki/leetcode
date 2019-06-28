class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        List<String> dummy = new ArrayList<String>();
        TreeMap map = new TreeMap();
        String temp;
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");        
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        if (digits.length() == 0)
            return result;
        if (digits.length() >= 1){
            temp = (String)map.get(digits.charAt(0));
            for(int i=0;i< temp.length();i++)
                result.add(temp.substring(i,i+1));
            if(digits.length() == 1)
                return result;
            
            for(int i=1;i<digits.length();i++){
                temp = (String)map.get(digits.charAt(i));               
                for(int j=0;j<result.size();j++)
                    for(int t=0;t<temp.length();t++)
                        dummy.add(((String)result.get(j))+temp.substring(t,t+1));
                        
                 result.clear();
                 for(int m=0;m<dummy.size();m++)
                     if(dummy.get(m).length() == i+1 )
                         result.add(dummy.get(m));
            }
        }        
        return result;
    }
}
