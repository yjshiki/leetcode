class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J == "")
            return 0;
        List<Character> lst = new ArrayList<Character>();
        for(int i=0;i<J.length();i++)
            if(!lst.contains(J.charAt(i)))
                lst.add(J.charAt(i));
        int res = 0;
        for(int i=0;i<S.length();i++)
            if(lst.contains(S.charAt(i)))
                res++;
        return res;
    }
}
