
  //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



public class Problem234 {
    public boolean isPalindrome(ListNode head) {
        ListNode look = head;
        int count = 1;
        while(look.next != null){
            count++;
            look = look.next;
        }

        int[] values = new int[count];
        for(int i=0;i<count;i++){
            values[i] = head.val;
            head = head.next;
        }
        int total = 0;
        for(int i=0;i<count/2;i++){
            if(values[i] == values[count-i-1]){
                total++;
            }

        }

        return total==count/2;
    }
}
