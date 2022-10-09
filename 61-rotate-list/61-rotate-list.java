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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int size = 0;
        ListNode temp2 = head;
        ListNode temp = head;
        ListNode start = head;
        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }
        int pos;
        if(k<=size)
        {
            pos = k;
        }
        else
        {
            pos = k%size;
        }
         if(pos==size || pos==0)
            return head;
        int i = 0;
        int frw = size - pos;
        temp = head;
        while(i<frw)
        {
            head = head.next;
            i++;
        }
        while(temp.next!=head)
        {
            temp = temp.next;
        }
        while(temp2.next!=null)
        {
            temp2 = temp2.next;
        }
        temp.next = null;
        temp2.next = start;
        return head;
        }
}