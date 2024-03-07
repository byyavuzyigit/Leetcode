/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Problem876 {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode look = head;
        int count = 1;
        while(look.next != null){
            count++;
            look = look.next;
        }
        double mid = Math.ceil(count/2);
        ListNode midNode = head;
        while(mid > 0.0){
            midNode = midNode.next;
            mid--;
        }
        return midNode;
    }
}
