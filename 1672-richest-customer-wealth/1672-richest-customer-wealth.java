class Solution {
    public int maximumWealth(int[][] accounts) {
        int i,j;
        int prev = 0;
        int sum = 0;
        for(i=0;i<accounts.length;i++)
        {
            for(j=0;j<accounts[0].length;j++)
            {
                sum = sum + accounts[i][j];
            }
            if(sum>prev)
                prev = sum;
            sum = 0;
        }
        
        return prev;
        
    }
}