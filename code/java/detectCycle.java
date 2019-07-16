/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head,fast = head;
        slow = slow.next;
        fast = fast.next.next;
        while(slow != fast){
            if(slow == null || fast == null || fast.next == null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;        
    }
}
