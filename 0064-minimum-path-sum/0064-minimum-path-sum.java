class Solution {
    public int minPathSum(int[][] grid) {
        
         Integer[][] dp = new Integer[grid.length][grid[0].length];
        return minSum(0,0,grid,dp);
        
    }
    public int minSum(int r, int c, int[][] grid,Integer[][] dp) {
        if (r == grid.length - 1 && c == grid[0].length - 1) {
            return grid[r][c];
        }
        if(dp[r][c]!=null)
            return dp[r][c];
        int left = Integer.MAX_VALUE;
        int  right  = Integer.MAX_VALUE;
        if (r < grid.length - 1)
        {
           left = grid[r][c] + minSum(r+1,c,grid,dp);
        }
        if(c<grid[0].length-1)
        {
            right = grid[r][c] + minSum(r,c+1,grid,dp);
        }
         return dp[r][c] =  Math.min(left,right);
        }

}