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
public class Problem141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode head1 = head;
        ListNode head2 = head.next;
        while(head1 != null && head2 != null && head2.next != null){
            if(head1 == head2){
                return true;
            }
            head1 = head1.next;
            head2 = head2.next.next;
        }
        return false;
    }
}
