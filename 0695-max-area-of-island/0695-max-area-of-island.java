class Solution {
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
    // 2 is visit
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] visit = new int[r][c];
        for(int[] row : visit)
        {
            Arrays.fill(row,-1);
        }
        int i,j;
        int max = 0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(grid[i][j]==1 && visit[i][j]!=2)
                {
                    visit[i][j] = 2;
                    int area = bfs(grid,visit,new Pair(i,j));
                    if(area>max)
                        max = area;
                    
                }
            }
        }
        
        return max;
        
    }
    
    public int bfs(int[][] grid, int[][] visit, Pair obj)
    {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(obj);
        int area = 0;
        while(!queue.isEmpty())
        {
            int row = queue.peek().r;
            int col = queue.peek().c;
            area += 1;
            queue.poll();
            int[] delrow = {-1,0,1,0};
            int[] delcol = {0,1,0,-1};
            for(int i = 0;i<4;i++)
            {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if((nrow>=0 && nrow<grid.length) && (ncol>=0 && ncol<grid[0].length) && grid[nrow][ncol]!=0 && visit[nrow][ncol]!=2)
                {
                    queue.offer(new Pair(nrow,ncol));
                    visit[nrow][ncol] = 2;
                    
                }
            }
            
        }
        
        return area;
    }
}