class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        int i;
        String m = "";
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='0')
                m = m + '1';
            else
                m = m + '0';
                
        }
        int num = Integer.parseInt(m,2);
        return num;
        
    }
}