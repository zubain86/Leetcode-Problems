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
    public int findMaxFish(int[][] grid)
    {
        Integer[][] visit = new Integer[grid.length][grid[0].length];
        for (Integer[] integers : visit) {
            Arrays.fill(integers,0);
        }
        int i,j,fish = 0,maxFish = 0;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]>0 && visit[i][j]!=-1)
                {
                    visit[i][j] = -1;
                    fish = bfs(grid,visit,new Pair(i,j));
                    if(fish>maxFish)
                    maxFish = fish;
                }
                    
            }
        }

        return maxFish;
    }
     public int bfs(int[][] grid,Integer[][] visit,Pair obj)
    {
        Queue<Pair> q = new LinkedList<>();
        q.offer(obj);
        int sum = 0;
        sum+= grid[q.peek().r][q.peek().c];
        while(!q.isEmpty())
        {
            int r = q.peek().r;
            int c = q.peek().c;
            q.poll();
            int[] row = {0,-1,1,0};
            int[] col = {1,0,0,-1};
            for (int i = 0; i < col.length; i++) {
                int nr = r + row[i];
                int nc = c + col[i];
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && visit[nr][nc]!=-1 && grid[nr][nc]>0 )
                {
                    q.offer(new Pair(nr, nc));
                    visit[nr][nc] = -1;
                    sum+= grid[nr][nc];

                }
                
            }
        }  

        return sum;

    }
    
}