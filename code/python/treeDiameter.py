class Solution(object):
    def treeDiameter(self, edges):
        """
        :type edges: List[List[int]]
        :rtype: int
        """
        if len(edges) == 0:
            return 0
        if len(edges) == 1:
            return 1
        length = len(edges)
        for i in range(length):
            edges.append([edges[i][1],edges[i][0]])
        start = set([edges[0][0]])
        start,_ = self.bfs(edges,start)
        _,count = self.bfs(edges,set([start[0]]))

        return count
        
    
    def bfs(self,edges,start):
        lst = []
        visited = set([])
        count = 0
        while True:
            for e in edges:
                if e[0] in start and e[1] not in visited:
                    lst.append(e[1])
                    visited.add(e[0])
            if lst == []:
                return start,count
            start = lst
            lst = []
            count += 1
