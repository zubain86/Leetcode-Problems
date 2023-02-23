class Solution {
    // 2 represents visited
    class Pair
    {
         int r;
         int c;
         Pair(int r,int c)
         {
             this.r = r;
             this.c = c;
         }
    }
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] visit = new int[r][c];
        for(int[] rows : visit)
            Arrays.fill(rows,-1);
        int i,j;
        Pair obj = null;
        Queue<Pair> queue = new LinkedList<>();
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                 if(grid[i][j]==1 && visit[i][j]!=2)
                 {
                     visit[i][j] = 2;
                     queue.offer(new Pair(i,j));
                     break;
                 }
            }
        }

        int per = 0;
        while(!queue.isEmpty())
        {
            int row = queue.peek().r;
            int col = queue.peek().c;
            queue.poll();
            int[] delrow = {-1,0,1,0};
            int[] delcol = {0,1,0,-1};
            for(int k = 0;k<4;k++)
            {
                 int nrow = row + delrow[k];
                 int ncol = col + delcol[k];
                    if(nrow<0)
                        per++;
                    if(nrow==r)
                        per++;
                    if(ncol<0)
                        per++;
                    if(ncol==c)
                        per++;
                if((nrow>=0 && nrow<r) && (ncol>=0 && ncol<c) && visit[nrow][ncol]!=2)
                {
                   
                    if(grid[nrow][ncol]==1)
                    {
                        queue.offer(new Pair(nrow,ncol));
                        visit[nrow][ncol] = 2;
                    }
                    else
                    {
                        per++;
                    }
                }
            }
        }
        
        return per;
    }
}