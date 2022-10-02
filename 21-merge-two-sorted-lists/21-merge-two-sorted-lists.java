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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null)
            return list1;
        else if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        ListNode temp1 = list1;
       ListNode temp2 = list2;
        ListNode head;
        if(list1.val<list2.val){
            head = new ListNode(list1.val);
            temp1 = temp1.next;
        }
        else
        {
            head = new ListNode(list2.val);
            temp2 = temp2.next;
        }
        ListNode temp = head;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                ListNode node = new ListNode(temp1.val);
                temp.next = node;
                temp = temp.next;
                temp1= temp1.next;
                
            }
            else
            {
                ListNode node = new ListNode(temp2.val);
                temp.next = node;
                temp = temp.next;
                temp2= temp2.next;
                
            }
        }
        while(temp1!=null)
        {
            ListNode node = new ListNode(temp1.val);
            temp.next = node;
            temp = temp.next;
            temp1 = temp1.next;
        }
         while(temp2!=null)
        {
            ListNode node = new ListNode(temp2.val);
            temp.next = node;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return head;
    }
}