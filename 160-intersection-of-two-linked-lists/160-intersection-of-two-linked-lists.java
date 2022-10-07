/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = 0;
        int size2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=null)
        {
            temp1 = temp1.next;
            size1++;
        }
        while(temp2!=null)
        {
             temp2 = temp2.next;
            size2++;
        }
        int i = 0;
        temp1= headA;
        temp2 = headB;
        if(size2>size1)
        {
             int begin = size2 - size1;
            while(i<begin)
            {
                temp2 = temp2.next;
                i++;
            }
        }
        else
        {
             int begin = size1- size2;
            while(i<begin)
            {
                temp1 = temp1.next;
                i++;
            }
        }
        while(temp1!=null && temp2!=null)
        {
            if(temp1==temp2)
                return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
            
        }
        return null;
        
    }
}