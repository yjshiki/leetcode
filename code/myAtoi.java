class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        str = str.split(" ")[0];
        int INT_MAX = (int)(Math.pow(2,31) -1);
        int INT_MIN = (int)(-Math.pow(2,31));
        int start = -2;
        int flag = 0;
        int end = str.length();
        char c;
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            if('0'<= c & c<='9'){
                if(flag==0){
                start = i;
                flag = 1;
                }

            }
            else
                if(flag == 1){
                    end = i;
                    break;
                }
            
        }
        //System.out.println(end);
        if(start == 1){
            if(str.charAt(0) == '+'){
                try{
                    return Integer.valueOf(str.substring(start,end));
                }
                catch(Exception e){
                    return INT_MAX;
                }
                    
            }
            if(str.charAt(0) == '-'){
                try{
                    return -Integer.valueOf(str.substring(start,end));
                }
                catch(Exception e){
                    return INT_MIN;
                }
            }
        }
        else if(start == 0){
                try{
                    return Integer.valueOf(str.substring(start,end));
                }
                catch(Exception e){
                    return INT_MAX;
                }           
        }
        System.out.println(start);
        return 0;
    
        


    }
}
