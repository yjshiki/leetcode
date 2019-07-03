class Solution {
    public int lengthOfLastWord(String s) {
        String[] lst = s.split(" ");
        if(lst.length == 0)
            return 0;
        String lastWord = lst[lst.length-1];
        
        for(int i = 0;i<lastWord.length();i++)
            if((lastWord.charAt(i) >= 'a' && lastWord.charAt(i) <= 'z') || (lastWord.charAt(i) >= 'A' && lastWord.charAt(i) <= 'Z'))
                continue;
            else
                return 0;
        
        return lastWord.length();
    }
}
