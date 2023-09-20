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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next==null)
            return head;
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while(temp2!=null)
        {
            int a = temp1.val;
            int b = temp2.val;
            int g = gcd(a,b);
            ListNode n = new ListNode(g,temp2);
            temp1.next = n;
            temp1 = n.next;
            temp2 = temp2.next;
        }
        
        return head;
            
 }
    
    public int gcd(int a, int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}