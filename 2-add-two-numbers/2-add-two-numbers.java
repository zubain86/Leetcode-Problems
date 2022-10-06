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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        int size1 = 0;
        while(temp!=null)
        {
            temp = temp.next;
            size1++;
        }
        temp = l2;
        int size2 = 0;
        while(temp!=null)
        {
            temp = temp.next;
            size2++;
        }
        ListNode temp1;
        ListNode back;
        if(size1>=size2)
        {
            temp = l1;
            back = temp;
            temp1 = l2;
        }
        else
        {
            temp = l2;
            temp1 = l1;
            back = temp;
        }
        int cry = 0;
        while(temp1!=null)
        {
            int add = temp.val + temp1.val + cry;
            if(add>9)
            {
                temp.val = add%10;
                cry = add/10;
            }
            else
            {
                temp.val = add;
                cry = 0;
            }
            temp = temp.next;
            temp1 = temp1.next;
        }
        while(temp!=null)
        {
            int add = temp.val + cry;
            if(add>9)
            {
                temp.val = add%10;
                cry = add/10;
            }
            else
            {
                temp.val = add;
                cry = 0;
            }
            temp = temp.next;
        }
        while(back.next!=null)
        {
            back = back.next;
        }
        if(cry!=0)
        {
            ListNode node = new ListNode(cry);
            back.next = node;
                
        }
        if(size1>=size2)
        {
            return l1;
        }
        else
        {
           return l2;
        }
        
}}