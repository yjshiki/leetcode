# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        slow = head
        fast = head
        if head == None or head.next == None:
            return False
        slow = slow.next
        fast = fast.next.next
        while slow!= fast:
            if slow == None or fast == None or fast.next == None:
                return False
            slow = slow.next
            fast = fast.next.next
        return True
        
