/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
          if(head==null)
            return null;
        ListNode slow=head;
        ListNode fast=head.next;
        int flag = 0;
        while(slow!=null && fast!=null)
        {
            if(slow==fast)
            {
                flag = 1;
                break;
            }
            slow = slow.next;
            fast = fast.next;
            if(fast==null)
                return null;
            fast = fast.next;
                
        }
        if(flag==1)
        {           
             int count  = 1; 
             fast = fast.next;
            
            while(slow!=fast)
            {
                count++;
                fast = fast.next;
            }
            fast = head;
            slow = head;
            int i;
            for(i=0;i<count;i++)
            {
                fast =  fast.next;
            }
            while(slow!=fast)
            {
                slow = slow.next;
                fast = fast.next;
                
            }
            return slow;
        }
        
        return null;
        
    
}}