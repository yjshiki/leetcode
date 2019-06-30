class Solution {
    //pay attention to overflow in java
    public int mySqrt(int x) {
        if(x==0)
            return 0;
        int left = 1;
        int right = x;
        int mid;
        while(true){
            mid = (left + right)/2;
            if (mid > x/mid) {
                right = mid;
            }
            else if (mid == x/mid)
                return mid;
            else{
                if (mid + 1 > x/(mid + 1))
                    return mid;
                if((mid + 1) == x/(mid+1))
                    return mid+1;
                left = mid;
            }     
        }
    }
}

