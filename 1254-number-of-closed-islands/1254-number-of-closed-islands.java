class Solution {
    // 1 corresponds grid is visited
    class Pair
    {
        int r;
        int c;
        Pair(int r, int c)
        {
             this.r = r;
             this.c = c;
        }
    }
    public int closedIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] visit = new int[r][c];
        int i,j;
        int count = 0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(i!=0 && j!=0 && i!=(r-1) && j!=(c-1) && visit[i][j]!=1 && grid[i][j]==0)
                {
                    visit[i][j] = 1;
                    boolean check = bfs(grid,visit,new Pair(i,j));
                    if(check)
                        count++;
                }
        }
     }
        
        return count;
        
    }
    public boolean bfs(int[][] grid,int[][] visit, Pair obj)
    {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(obj);
        boolean flag = true;
        while(!queue.isEmpty())
        {
            int r = queue.peek().r;
            int c = queue.peek().c;
            queue.poll();
            int[] delrow = {-1,0,1,0};
            int[] delcol = {0,1,0,-1};
            int i;
            for(i=0;i<4;i++)
            {
                int nrow = r + delrow[i];
                int ncol = c + delcol[i];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && visit[nrow][ncol]!=1 && grid[nrow][ncol]==0)
                {
                    if(nrow==0 || nrow==grid.length-1 || ncol==0 || ncol==grid[0].length-1)
                        flag =  false;
                    queue.offer(new Pair(nrow,ncol));
                    visit[nrow][ncol] = 1;
                }
                    
            }
        }
        
        return flag;
    }
}