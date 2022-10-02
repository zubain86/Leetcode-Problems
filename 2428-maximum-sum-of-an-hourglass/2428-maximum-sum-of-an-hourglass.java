class Solution {
    public int maxSum(int[][] grid) {
        int i,j;
        int row = grid.length;
        int col = grid[0].length;
        int maxsum = 0, sum = 0;
        for(i=0;i<row-2;i++)
        {
             for(j=0;j<col-2;j++)
             {
                 sum = sum + grid[i][j] + grid[i][j+1] + grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] + grid[i+2]                    [j+1] + grid[i+2][j+2];
                 if(sum>maxsum)
                     maxsum = sum;
                 sum = 0;
                 
             }
        }
    
    return maxsum;
        
    }
}