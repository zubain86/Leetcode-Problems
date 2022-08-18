class Solution {
    public int countNegatives(int[][] grid) {
        int i,j;
        int count = 0;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]<0)
                    count++;
            }
        }
        return count;
        
    }
}