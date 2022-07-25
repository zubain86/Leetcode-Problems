class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        
        int l = 0;
        // getting the length of the list
        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            l++;
        }
        
        
        // going to the node just before the node which we need to delete. . 
        temp = head;
        int ind = l-n-1;    
        int i;        
        
        if(ind>=0)
        {
        for ( i = 0; i<ind ;i++)
            temp = temp.next;
        

        if (temp.next != null) 
        temp.next = temp.next.next;
        
        return head;
        }
        else
        {
              if (temp.next != null)
            head  = temp.next;
            else
                return null;
            return head;
        }
        
        
    }
}