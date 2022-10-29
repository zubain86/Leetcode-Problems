class Solution {
    public String addBinary(String a, String b) {
        
        int l1 = a.length()-1;
        int l2 = b.length()-1;
        String carry = "0";
        String m = "";
        while(l1>=0 && l2>=0)
        {
            char ch1 = a.charAt(l1);
            char ch2 = b.charAt(l2);
            if(ch1=='1' && ch2=='1' && carry.equals("1"))
            {
                m = "1" + m;
                carry = "1";
            }
           else if(ch1=='1' && ch2=='1' && carry.equals("0"))
            {
                m = "0" + m;
                carry = "1";
            }
             else if(ch1=='0' && ch2=='0' && carry.equals("1"))
            {
                m = "1" + m;
                carry = "0";
            }
             else if(ch1=='0' && ch2=='0' && carry.equals("0"))
            {
                m = "0" + m;
                carry = "0";
            }
             else if(carry.equals("0"))
            {
                m = "1" + m;
                carry = "0";
            }
             else if(carry.equals("1"))
            {
                m = "0" + m;
                carry = "1";
            }
            l1--;
            l2--;
        }
            while(l1>=0)
            {
                char ch = a.charAt(l1);
                if(ch=='0' && carry.equals("0"))
                {
                    m = "0" + m;
                    carry = "0";
                }
               else if(ch=='1' && carry.equals("1"))
                {
                    m = "0" + m;
                    carry = "1";
                }
                else
                {
                    m = "1" + m;
                    carry = "0";
     
                }
                 l1--;   
            }
        
            while(l2>=0)
            {
                char ch = b.charAt(l2);
                if(ch=='0' && carry.equals("0"))
                {
                    m = "0" + m;
                    carry = "0";
                }
               else if(ch=='1' && carry.equals("1"))
                {
                    m = "0" + m;
                    carry = "1";
                }
                else
                {
                    m = "1" + m;
                    carry = "0";
     
                }
                l2--;
                    
            }
        
        if(carry.equals("1"))
            m = "1" + m;
        return m;
    }
}
