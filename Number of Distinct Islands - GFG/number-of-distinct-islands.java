//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int countDistinctIslands(int[][] grid) {
        HashSet<ArrayList<ArrayList<Integer>>> set = new HashSet<>();
        int r = grid.length;
        int c = grid[0].length;
        int [][] visit = new int[r][c];
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                if(grid[i][j]==1 && visit[i][j]==0)
                {
                    ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
                    dfs(i,j,i,j,visit,grid,ls);
                    set.add(ls);
                }
            }
        }
        
        return set.size();
         
    }
    
    public void dfs(int row, int col, int srow, int scol, int [][] visit, int[][]grid, ArrayList<ArrayList<Integer>> ls )
    {
    visit[row][col] = 1;
    ArrayList<Integer> res = new ArrayList<>();
    int calrow = row - srow;
    int calcol = col - scol;
    res.add(calrow);
    res.add(calcol);
    ls.add(res);
    int[] delrow = {0,0,-1,1};
    int[] delcol = {-1,1,0,0};
    for(int i =0; i<4; i++)
    {
        int nrow = row + delrow[i];
        int ncol = col + delcol[i];
        if(nrow>=0 && ncol >=0 && nrow<grid.length && ncol<grid[0].length && visit[nrow][ncol]==0 && grid[nrow][ncol]==1)
        {
            dfs(nrow,ncol,srow,scol,visit,grid,ls);
        }
    }
}

}