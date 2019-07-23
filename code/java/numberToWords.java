class Solution {
    public String numberToWords(int num) {
        if(num == 0)
            return "Zero";
        List<Integer>lst = new ArrayList<Integer>();
        while(num!=0){
            lst.add(num%1000);
            num /= 1000;
        }
        String[] dic1 = {"","Thousand","Million","Billion"};
        Map<Integer,String> dic2 = new HashMap<Integer,String>();
        dic2.put(1,"One");
        dic2.put(2,"Two");
        dic2.put(3,"Three");
        dic2.put(4,"Four");
        dic2.put(5,"Five");
        dic2.put(6,"Six");
        dic2.put(7,"Seven");
        dic2.put(8,"Eight");
        dic2.put(9,"Nine");
        dic2.put(10,"Ten");
        dic2.put(11,"Eleven");
        dic2.put(12,"Twelve");  
        dic2.put(13,"Thirteen");
        dic2.put(14,"Fourteen");
        dic2.put(15,"Fifteen");
        dic2.put(16,"Sixteen");
        dic2.put(17,"Seventeen");
        dic2.put(18,"Eighteen");
        dic2.put(19,"Nineteen");
        dic2.put(20,"Twenty");
        dic2.put(30,"Thirty");
        dic2.put(40,"Forty");
        dic2.put(50,"Fifty");
        dic2.put(60,"Sixty");
        dic2.put(70,"Seventy");
        dic2.put(80,"Eighty");
        dic2.put(90,"Ninety"); 
        String res = "";
        int flag = 0;
        for(int i=lst.size()-1;i>=0;i--){
            int num1 = lst.get(i);
            if(num1 == 0)
                continue;
            if(num1 >= 100){
                res += dic2.get(num1/100);
                res += " Hundred ";
                num1 = num1%100;
            }   
            if(num1 >= 20){
                res += dic2.get((num1/10) * 10);
                res += " ";
                num1 = num1%10;
            }
            else if(num1 >= 10){
                res += dic2.get(num1);
                res += " ";
                flag = 1;
            }
            if(flag == 0 && num1>0){
                res += dic2.get(num1);
                res += " ";
            }
            else
                flag = 0;
            if(i != 0)
                res += dic1[i] + " ";
        }
        for(int i=res.length()-1;i>=0;i--)
            if(res.charAt(i) != ' ')
                return res.substring(0,i+1);
        return res;       
    }
}
