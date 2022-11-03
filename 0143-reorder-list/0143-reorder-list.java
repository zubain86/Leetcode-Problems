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
    public void reorderList(ListNode head) {
        if(head.next==null)
            return;
        ListNode start = head;
        ListNode frws = head;
        ListNode last = head;
        ListNode prevl = head;
        while(start.next.next!=null)
        {
            frws = start.next;
            prevl = goToSecond(prevl);
            last = prevl.next;
            start.next = last;
            last.next = frws;
            prevl.next = null;
            start = frws;
            prevl = start;
            if(start.next==null)
                break;
        }
        
    }
    public ListNode goToSecond(ListNode temp)
    {
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        
        return temp;
    }
}