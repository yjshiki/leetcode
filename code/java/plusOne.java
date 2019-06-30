class Solution {
    public int[] plusOne(int[] digits) {
        int carrier = 0;
        for(int i=digits.length-1;i>=0;i--){
            if(i == digits.length-1)
                digits[i] = digits[i] + 1;
            
            if(carrier == 1){
                digits[i] = digits[i] + 1;
                carrier = 0;
            }
            
            if(digits[i] > 9){
                digits[i] = digits[i] - 10;
                carrier = 1;
            }
        }
        if(carrier==0)
            return digits;
        else{
            int[] head = new int[digits.length+1];
            head[0] = 1;
            System.arraycopy(head,0,digits,0,digits.length);
            return head;
        }
    }
}
