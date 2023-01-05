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
    public ListNode oddEvenList(ListNode head) {
        //Counting nodes
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        if(count<3)
            return head;
        ListNode temp1 = head;
        ListNode headev = head.next;
        ListNode temp2 = headev;
        
        if(count%2==0)
        {
        
        while(temp1.next.next!=null){
        temp1.next = temp2.next;
        temp1 = temp2.next;
        temp2.next = temp1.next;
        temp2 = temp1.next;
        }
            temp2.next = null;
            temp1.next = headev;
        }
        else
        {
            while(temp1.next.next.next!=null){
        temp1.next = temp2.next;
        temp1 = temp2.next;
        temp2.next = temp1.next;
        temp2 = temp1.next;
        }
              temp1.next = temp2.next;
              temp1 = temp2.next;
              temp2.next = null;
              temp1.next = headev;
        }
        
        return head;
        
    }
}