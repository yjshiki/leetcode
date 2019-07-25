class Solution:
    def compress(self, chars: List[str]) -> int:
        i = 0
        index = 0
        lst = []
        while i < len(chars)-1:
            if chars[i] != chars[i+1]:
                lst.append(chars[i])
                i = i + 1
            else:
                j = i + 1
                while j < len(chars):
                    if chars[j] != chars[i]:
                        break
                    else:
                        j = j + 1
                temp = j - i;
                lst.append(chars[i])
                lst2 = []
                while temp > 0:
                    lst2.append(str(temp%10))
                    temp = temp//10
                lst2.reverse()
                #print(lst2)
                lst.extend(lst2)
                i = j
        if i == len(chars) - 1:
            lst.append(chars[i])
            
        for i in range(len(lst)):
            chars[i] = lst[i]
        return len(lst)
            
        
