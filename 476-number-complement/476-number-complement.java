class Solution {
    public int findComplement(int num) {
         String s = Integer.toBinaryString(num);
        String m = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='0')
                m = m+'1';
            else
                m = m+'0';
        }
        return Integer.parseInt(m,2);
        
    }
}