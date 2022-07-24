class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] a = jewels.toCharArray();
        char[] b = stones.toCharArray();
        int count = 0;
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<b.length;j++)
            {
                if(a[i] == b[j])
                    count++;
            }
        }
        
        return count;
        
    }
}