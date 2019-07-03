class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        StringBuilder s = new StringBuilder();
        helper(res,s,0,0,n);
        return res;
    }
    
    public void helper(List<String> res, StringBuilder s,int open,int close,int n){
        if(open == n && close == n){
            res.add(s.toString());
            return;
        }
        if(open < n){
            s.append("(");
            helper(res,s,open+1,close,n);
            s.setLength(s.length()-1);
        }
        
        if(close < open){
            s.append(")");
            helper(res,s,open,close+1,n);     
            s.setLength(s.length()-1);
        }
    }
}
