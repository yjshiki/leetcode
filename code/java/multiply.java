class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int[] res = new int[len1+len2];
        for(int i=0;i<len1;i++)
            for(int j=0;j<len2;j++)
                res[res.length-2-(i+j)] += Character.getNumericValue(num1.charAt(i)) *     Character.getNumericValue(num2.charAt(j));
        String result = "";
        int carrier = 0;
        for(int i=0;i < res.length;i++)
            if(i==0){
                result = (res[i]%10 + "") + result;
                carrier = res[i]/10;
            }
            else{
                result = ((res[i] + carrier)%10 + "") + result;
                carrier = (res[i] + carrier)/10;
            }
        for(int i=0;i<result.length();i++)
            if(result.charAt(i) != '0')
                return result.substring(i,result.length());
        return "0";
        
    }
}
