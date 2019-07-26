class Solution:
    def highFive(self, items: List[List[int]]) -> List[List[int]]:
        dic = {}
        for i in range(len(items)):
            if items[i][0] not in dic:
                dic[items[i][0]] = [items[i][1]]
            else:
                dic[items[i][0]].append(items[i][1])
        res = []
        for key in dic:
            temp = sorted(dic[key])
            avg = sum(temp[len(temp)-5:])//5
            res.append([key,avg])
        return res
