class Solution {
    public String simplifyPath(String path) {
        Stack<String> temp = new Stack<String>();
        String[] lst = path.split("/");
        
        for(int i=0;i<lst.length;i++){
            if(lst[i].equals("..")==true && temp.isEmpty() == false){
                temp.pop();               
            }
            else if(lst[i].equals(".") == false && lst[i].equals("..") == false && lst[i].equals("") ==false)
                temp.push(lst[i]);
        }
        String res = "";
        while(!temp.isEmpty())
            res = "/" + temp.pop() + res;
        if (res.equals(""))
            return "/";
        return res;
    }
}
