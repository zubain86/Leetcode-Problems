class Solution {
    class Pair
    {
        int r;
        int c;
        char val;
        Pair(int r,int c)
        {
            this.r = r;
            this.c = c;
        }
    }
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        char[][] visit = new char[r][c];
         for (char[] row : visit)
            Arrays.fill(row, 'u');
        int i,j;
        int count = 0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(grid[i][j]=='1' && visit[i][j]!='v')
                {
                    visit[i][j] = 'v';
                    count+= bfs(grid,visit,new Pair(i,j));
                }
            }
        }
        
        return count;
    }
    
    public int bfs(char[][] grid, char[][] visit, Pair obj)
    {
         Queue<Pair> queue = new LinkedList<>();
         queue.offer(obj);
        int[] delrow =  {-1,0,1,0};
        int[] delcol =  {0,1,0,-1};
        int i;
        while(!queue.isEmpty())
        {
            int r = queue.peek().r;
            int c = queue.peek().c;
            queue.poll();
            for(i=0;i<4;i++)
            {
                    int nrow = r + delrow[i];
                    int ncol = c + delcol[i];
                    if((nrow>=0 && nrow<grid.length) && (ncol>=0 && ncol<grid[0].length) && grid[nrow][ncol]!='0' && visit[nrow][ncol]!='v')
                    {
                        queue.offer(new Pair(nrow,ncol));
                        visit[nrow][ncol] = 'v';
                    }
                }
            }
        return 1;
        }
      
    }
