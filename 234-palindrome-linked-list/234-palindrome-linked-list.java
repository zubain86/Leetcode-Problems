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
class Solution {
    public boolean isPalindrome(ListNode head) {
      ListNode mid = middleNode(head);
      ListNode rev = reverseList(mid);
      while(head!=mid&&rev!=null)
      {
          if(head.val!=rev.val)
              return false;
          head = head.next;
          rev = rev.next;
      }
        return true;
        
    }
    public ListNode middleNode(ListNode head) {
        if(head.next==null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        do
        {
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
            if(fast==null)
                return slow;
        }
        while(fast.next!=null);
            
        return slow;
        
    }
     public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode prev = null;
        ListNode forw = head.next;
        while(forw!=null)
        {
            head.next = prev;
            prev = head;
            head = forw;
            forw = forw.next;
        }
        head.next = prev;
        return head;
        
    }
}