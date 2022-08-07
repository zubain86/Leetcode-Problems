class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int i,j;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                
                if(i==j&&grid[i][j]==0)
                    return false;
                 else if(i+j==grid.length-1&&grid[i][j]==0)
                    return false;
                 else if((i!=j&&i+j!=grid.length-1)&&grid[i][j]!=0)
                     return false;
                else
                    continue;
                    
            }
        }
        return true;
        
    }
}