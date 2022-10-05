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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }
        int begin = size - n ;
        temp = head;
        ListNode temp2 = null;
        int i=0;
        while(i<begin)
        {
            temp2 = temp;
            temp = temp.next;
            i++;
        }
        if(i==0)
            return head.next;
        temp2.next = temp.next;
        return head;
        
    }
}