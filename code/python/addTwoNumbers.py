# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        p = ListNode(0)
        dummy = p
        p.next = l1
        flag = 0
        while l1 != None or l2!= None:
            if l1 != None and l2!= None:
                p.next.val += l2.val
                l1 = l1.next
                l2 = l2.next
            elif l1 != None and l2 == None:
                p.next = l1
                l1 = l1.next
            elif l2!= None and l1 == None:
                p.next = l2
                l2 = l2.next
            
            if flag == 1:
                p.val += 1
            
            if p.val >= 10:
                p.val = p.val - 10
                flag = 1
            else:
                flag = 0            
            
            p = p.next
            
        if flag == 1:
            p.val += 1
        if p.val >= 10:
            p.val = p.val - 10
            temp = ListNode(1)
            p.next = temp
            
            
            
        return dummy.next
