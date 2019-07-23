class Solution:
    def numberToWords(self, num: int) -> str:
        if(num == 0):
            return "Zero"
        lst = []
        while(num!=0):
            lst.append(num%1000)
            num //= 1000
        dic1 = [" ","Thousand","Million","Billion"]
        dic2 = {1:"One",2:"Two",3:"Three",4:"Four",5:"Five",6:"Six",7:"Seven",8:"Eight",9:"Nine",10:"Ten",
                11:"Eleven",12:"Twelve",13:"Thirteen",14:"Fourteen",15:"Fifteen",16:"Sixteen",
                17:"Seventeen",18:"Eighteen",19:"Nineteen",20:"Twenty",30:"Thirty",40:"Forty",
                50:"Fifty",60:"Sixty",70:"Seventy",80:"Eighty",90:"Ninety"
               }
        res = ""
        flag = 0
        for i in range(len(lst)):
            num1 = lst[len(lst)-1-i]
            if num1 == 0:
                continue
            if num1 >= 100:
                res += dic2[num1//100]
                res += " Hundred "
                num1 = num1%100
                
            if num1 >= 20:
                res += dic2[(num1//10) * 10]
                res += " "
                num1 = num1%10
            elif num1 >= 10:
                res += dic2[num1]
                res += " "
                flag = 1
                
            if flag == 0 and num1 > 0:
                res += dic2[num1]
                res += " "
            else:
                flag = 0
            if i != len(lst)-1:
                res += dic1[len(lst)-1-i]
                res += " "
        return res.rstrip()
        
