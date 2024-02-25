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
class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode count = head;
        int size = 1;
        while(count.next != null){
            count = count.next;
            size++;
        }
        if(size == 1){
            head = null;
            return head;
        }
        ListNode removing = findNode(head,size-n);
        if(removing == head){
            head = head.next;
            return head;
        }
        ListNode removeBefore = findNode(head,size-n-1);
        removeBefore.next = removing.next;
        return head;
    }

    private ListNode findNode(ListNode head, int n){
        if(n == 0){
            return head;
        }
        ListNode result = head;
        while(n > 0){
            result = result.next;
            n--;
        }
        return result;
    }
}
