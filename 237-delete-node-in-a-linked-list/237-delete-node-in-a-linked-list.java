/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
          ListNode list = node;
          while(list.next!=null)
          {
              list.val = list.next.val;
              if(list.next.next==null)
                  list.next = null;
              else
              list = list.next;
              
          }
    }
}