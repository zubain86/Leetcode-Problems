class Solution {
    class Pair
    {
        int r,c;
        Pair(int r,int c)
        {
            this.r = r;
            this.c = c;
        }
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int r = grid1.length;
        int c = grid1[0].length;
        int[][] visit = new int[r][c];
        int i,j,count=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(grid2[i][j]==1 && visit[i][j]!=1 && grid1[i][j]==1)
                {
                    visit[i][j] = 1;
                    boolean ch = bfs(grid1,grid2, visit, new Pair(i,j));
                    if(ch==true)
                    {
                        count++;
                    }
                }
            }
        }
        
        return count;
        
    }
    
    public boolean bfs(int[][] grid1,int[][] grid2,int[][] visit,Pair obj)
    {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(obj);
        boolean ch = true;
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
                if(nrow>=0 && nrow<grid1.length && ncol>=0 && ncol<grid1[0].length && visit[nrow][ncol]!=1 && grid2[nrow][ncol]==1)
                {
                    if(grid1[nrow][ncol]==0)
                        ch = false;
                    queue.offer(new Pair(nrow,ncol));
                    visit[nrow][ncol] = 1;
                }
            }
            
            
        }
        
        return ch;
    }
}