class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        if(s.equals(t))
            return true;
        Map<Character,String> ms = new HashMap<Character,String>();
        Map<Character,String> mt = new HashMap<Character,String>();
        String temp;
        for(int i = 0; i < s.length(); i++){
            if(!ms.containsKey(s.charAt(i)))
                ms.put(s.charAt(i),i+"");
            else{
                temp = ms.get(s.charAt(i));
                ms.replace(s.charAt(i),temp+(i + ""));
            }
            if(!mt.containsKey(t.charAt(i)))
                mt.put(t.charAt(i),i+"");
            else{
                temp = mt.get(t.charAt(i));
                mt.replace(t.charAt(i),temp+(i + ""));
            }
        }
        
        for(int i = 0; i < s.length(); i++)
            if(!ms.get(s.charAt(i)).equals(mt.get(t.charAt(i))))
                return false;
        return true;
    }
}
