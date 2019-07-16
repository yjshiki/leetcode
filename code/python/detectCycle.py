# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        slow = head
        fast = head
        if head == None or head.next == None:
            return None
        slow = slow.next
        fast = fast.next.next
        while slow!= fast:
            if slow == None or fast == None or fast.next == None:
                return None
            slow = slow.next
            fast = fast.next.next
        fast = head
        while slow!=fast:
            slow = slow.next
            fast = fast.next
        return slow    
