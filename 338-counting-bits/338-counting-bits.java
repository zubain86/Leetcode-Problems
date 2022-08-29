class Solution {
    public int[] countBits(int n) {
        int i;
        int count = 0;
        int[] m = new int[n+1];
        int k = 0;
        for(i=0;i<=n;i++)
        {
            String s = Integer.toBinaryString(i);
            for(int j=0;j<s.length();j++)
            {
                char ch = s.charAt(j);
                if(ch=='1')
                    count++;
            }
            m[k++] = count;
            count = 0;
                
        }
        
        return m;
        
    }
}