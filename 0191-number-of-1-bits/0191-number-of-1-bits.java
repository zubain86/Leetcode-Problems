public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int i;
        int count = 0;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='1')
                count++;
            
        }
        
        return count;
    }
}