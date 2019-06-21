# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        p = ListNode(0)
        dummy = p
        p.next = head
        p2 = ListNode(0)
        p2.next = head
        total = 0
        i = 0

        while p2.next:
            total += 1
            p2 = p2.next
        
        while p:
            if i == total - n:
                p.next = p.next.next
            i+=1
            p = p.next
                
        return dummy.next
