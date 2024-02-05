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
    public ListNode swapPairs(ListNode head) {
        
           ListNode temp1 = head;
           ListNode temp2 = null;
           ListNode prev = head;
           int flag = 0;
           while(temp1!=null)
           {
               temp2= temp1;
               if(temp2.next==null) {
                   break;
               }
               temp2= temp2.next;
               temp1.next = temp2.next;
               temp2.next = temp1;
               if(flag==0) {
                   head = temp2;
                   prev = temp1;
                   flag = 1;
               }
               else {
                   prev.next = temp2;
                   prev = temp1;
               }
               temp1 = temp1.next;
           }
        return head;
        
    }
}