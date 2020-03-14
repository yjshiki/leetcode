class Solution {
    public int strobogrammaticInRange(String low, String high) {
        int l = low.length();
        int h = high.length();
        int lnum = Integer.parseInt(low);
        int flag = 0;
        int hnum;
        try{
            hnum = Integer.parseInt(high);
        }catch (Exception e) {
            flag = 1;
        }
        if(flag == 1)
            hnum = Integer.MAX_VALUE;
        else
            hnum = Integer.parseInt(high);
        if(lnum > hnum)
            return 0;
        int count=0;
        List<String> temp = findStrobogrammatic(l);
        for(String num :temp){
            if(Integer.parseInt(num) >= lnum)
                count ++;
        }
        
        for(int i=l+1;i<h;i++){
            count += findStrobogrammatic(i).size();
        }
        if(l < h){
            temp = findStrobogrammatic(h);
            for(String num :temp){  
                try{
                    if(Integer.parseInt(num) <= hnum){
                        count ++;
                    }
                }catch (Exception e) {
                }
            }
        }
        else{
            for(String num :temp){
                if(Integer.parseInt(num) > hnum)
                    count --;
            } 
        }         
        return count;
    }
    
    public List<String> findStrobogrammatic(int n) {
        List<String> res = new ArrayList<String>();
        if(n==1){
            res.add("0");
            res.add("1");
            res.add("8");
            return res;
        }
        if(n==2){
            res.add("11");
            res.add("69");
            res.add("88");
            res.add("96");
            return res;
        }    
        
        if(n%2 != 0 ){
            List<String> pre = findStrobogrammatic(n-1);
            int q = n/2;
            
            for(int i=0;i<pre.size();i++){
                String s = pre.get(i);
                res.add(s.substring(0,q)+"0"+s.substring(q,n-1));
                res.add(s.substring(0,q)+"1"+s.substring(q,n-1));
                res.add(s.substring(0,q)+"8"+s.substring(q,n-1));
            }
            
            return res;
        }   
        else{
            List<String> pre = findStrobogrammatic(n-2);
            int q = n/2 - 1;
            for(int i=0;i<pre.size();i++){
                String s = pre.get(i);
                res.add(s.substring(0,q)+"00"+s.substring(q,n-2));
                res.add(s.substring(0,q)+"11"+s.substring(q,n-2));
                res.add(s.substring(0,q)+"69"+s.substring(q,n-2));
                res.add(s.substring(0,q)+"88"+s.substring(q,n-2));
                res.add(s.substring(0,q)+"96"+s.substring(q,n-2));
            }
            return res;
        }
    }
}
