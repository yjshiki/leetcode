class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []
        self.minNum = 0

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        if self.stack == []:
            self.stack.append(0)
            self.minNum = x
        else:
            self.stack.append(x-self.minNum)
            if x < self.minNum:
                self.minNum = x
        

    def pop(self):
        """
        :rtype: void
        """
        popped = self.stack.pop()
        if popped < 0:
            self.minNum -= popped

        

    def top(self):
        """
        :rtype: int
        """
        top = self.stack[-1]
        if top>0:
            return top + self.minNum
        else:
            return self.minNum
        

    def getMin(self):
        """
        :rtype: int
        """
        return self.minNum


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
