class Solution {
    public boolean isHappy(int n) {
        int count = 0;
        List<Integer> nums = new ArrayList<Integer>();
        while(true){
            while(n!=0){
               count += (n%10) * (n%10);
                n = n/10;
            }
            if(count == 1)
                return true;
            else
                if(!nums.contains(count)){
                    nums.add(count);
                    n = count;
                    count = 0;
                }
                else
                    return false;
        }
    }
}
