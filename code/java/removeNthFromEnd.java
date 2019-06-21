/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = new ListNode(0);
        ListNode dummy = new ListNode(0);
        ListNode p2 = new ListNode(0);
        
        p.next = head;
        p2.next = head;
        dummy.next = p;
        int total = 0;
        int i = 0;
        
        while(p2.next != null){
            total ++;
            p2 = p2.next;
        }
        
        while(p != null){
            if(i+n==total)
                p.next = p.next.next;
            i++;
            p = p.next;
        }
        
        return dummy.next.next;
    }
}
