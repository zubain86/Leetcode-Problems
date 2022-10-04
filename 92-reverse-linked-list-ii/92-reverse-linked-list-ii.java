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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right||head==null)
            return head;
       ListNode prev = null;
        ListNode mid = head;
        ListNode frw = mid.next;
        int i = 1;
        while(i<left)
        {
            prev = mid;
            mid = mid.next;
            frw = frw.next;
            i++;
        }
        ListNode last = head;
        i = 1;
        while(i<right)
        {
            last = last.next;
            i++;
        }
        if(prev!=null)
        {
            prev.next = last;
        }
            prev = mid;
            mid = mid.next;
            frw = frw.next;
            prev.next = last.next;
        i = 0;
         while(i<(right-left))
         {
            mid.next = prev;
            prev = mid;
             mid = frw;
             if(frw==null)
                 break;
             frw = frw.next;
             i++;
         }
        if(left==1)
            return prev;
        else
            return head;
        
        
    }
}