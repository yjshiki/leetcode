class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map1 = new HashMap<Character,String>();
        Map<String,Character> map2 = new HashMap<String,Character>();
        
        String[] words = str.split(" ");
        if(words.length != pattern.length())
            return false;
        
        for(int i=0;i<words.length;i++){
            if(!map1.containsKey(pattern.charAt(i)))
                map1.put(pattern.charAt(i),words[i]);
            else
                if(map1.get(pattern.charAt(i)).equals(words[i]) == false){
                    return false;
                }
            
            if(!map2.containsKey(words[i]))
                map2.put(words[i],pattern.charAt(i));
            else
                if(map2.get(words[i]) != pattern.charAt(i))
                    return false;
        }
        
        return true;
    }
}
