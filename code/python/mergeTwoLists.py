# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        l = ListNode(0)
        dummy = ListNode(0)
        dummy = l
        
        if l1 == None and l2 == None:
            return None 
        elif l1 == None:
            return l2
        elif l2 == None:
            return l1
        
        while(l1 != None or l2 != None):
            if(l1 != None and l2 != None):
                if l1.val < l2.val:
                    l.next = l1
                    l1 = l1.next
                else:
                    l.next = l2
                    l2 = l2.next
            elif(l1 != None and l2 == None):
                l.next = l1
                l1 = l1.next
            elif(l1 == None and l2 != None):
                l.next = l2
                l2 = l2.next
            l = l.next
        
        return dummy.next
