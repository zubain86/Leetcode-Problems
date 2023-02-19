class Solution {
    class Pair{
        int r;
        int c;
        int t;
        Pair(int r,int c,int t)
        {
            this.r = r;
            this.c = c;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int visit[][] = new int[r][c];
        Queue<Pair> queue = new LinkedList<>();
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j,0));
                    visit[i][j] = 2;
                }
                else
                {
                    visit[i][j] = 0;
                }
            }
        }
        
        int tm = 0;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        while(!queue.isEmpty())
        {
            int row = queue.peek().r;
            int col = queue.peek().c;
            int t = queue.peek().t;
            tm = Math.max(tm,t);
            queue.poll();
            for(i=0;i<4;i++)
            {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if((nrow>=0 && nrow<r) &&(ncol>=0 && ncol<c) && visit[nrow][ncol]!=2 && grid[nrow][ncol]==1)
                {
                    queue.offer(new Pair(nrow,ncol,t+1));
                    visit[nrow][ncol] = 2;
                }
            }
        }
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(grid[i][j]==1 && visit[i][j]!=2)
                    return -1;
            }
        }
        
        return tm;
    }
}