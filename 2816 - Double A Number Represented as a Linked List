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
    public ListNode doubleIt(ListNode head) {

        //Count and position temp
        int count = 1;
        ListNode temp = head.next;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        temp = head;
        while(temp.next!=null)
        temp = temp.next;
        int carry = 0;
        while(count!=1)
        {
            int val = 2 * temp.val + carry;
           if(val>9)
            {
            temp.val = val - 10;
            carry = 1;
            }
            else
            {
            temp.val = val;
            carry = 0;
            }

            ListNode dir = head;
            while(dir.next!=temp)
            dir = dir.next;
            temp = dir;
            count--;
        }

           int val = 2 * temp.val + carry;
           if(val>9)
            {
            ListNode node = new ListNode(1,temp);
            temp.val = val - 10;
            head = node;
            }
            else
            {
            temp.val = val;
            }

        return head;
        
    }
}
