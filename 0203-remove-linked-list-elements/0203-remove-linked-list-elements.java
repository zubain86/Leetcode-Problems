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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        while(head!=null && head.val==val )
            head = head.next;
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp1!=null)
        {
            if(temp1.val==val)
            {
                while(temp2.next!=temp1)
                {
                    temp2 = temp2.next;
                }
                
                temp2.next = temp1.next;
            }
            temp1 = temp1.next;
        }
        return head;
    }
}