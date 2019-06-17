class Solution {
    public int reverse(int x) {
        int flag = 1;
        if(x < 0){
            flag = -1;
            x = -x;
        }
        else if(x == 0)
            return 0;
        while(x%10 == 0)
            x = x/10;
        int count = 0;
        int UpBound = (int) Math.pow(2,31) - 1;
        int LowBound = (int) Math.pow(2,31);

        while(true){
            count = 10*count + x%10;
            x = x/10;
            if(x!=0){
                if(flag == 1 & count > (UpBound-x%10)/10)
                    return 0;
                else if(flag == -1 & count > (LowBound-x%10)/10)
                    return 0;
            }
            else
                break;

        }
        return count*flag;

        
    }
}
