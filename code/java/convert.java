/*
**This is the solution of Problem 6,ZigZag Conversion
*/

class Solution {
    public String convert(String s, int numRows) {
        String[] temp = new String[numRows];
        int length = s.length();
        String result = "";
        if(numRows == 1 || numRows > length)
            return s;
        
        int flag = 1;
        int index = 0;
        for(int i=0;i<length;i++){
            if(temp[index] == null)
                temp[index] = s.substring(i,i+1);               
            else
                temp[index] = temp[index] + s.substring(i,i+1);
            
            if(index == 0)
                flag = 1;
            else if(index == numRows-1)
                flag = -1;
            
            if(flag>0)
                index++;
            else
                index--;
        }
        for(int j=0;j<numRows;j++)
            result += temp[j];
                       
        return result;
        
    }
}
