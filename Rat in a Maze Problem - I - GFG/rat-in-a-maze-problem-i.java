//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
          return (includeAllPaths(0,0,"",m));
    }
      static ArrayList<String> includeAllPaths(int r, int c, String p, int[][] maze) {
        if ((r == maze.length-1 && c == maze[0].length-1) && maze[r][c]!=0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        if(maze[r][c]==0)
            return ans;
        maze[r][c] = 0;
        if(r< maze.length-1) {
            str = includeAllPaths(r + 1, c, p + "D", maze);
            ans.addAll(str);
        }
           if(c< maze[0].length-1) {
               str = includeAllPaths(r, c + 1, p + "R", maze);
               ans.addAll(str);
           }
        if(r> 0) {
            str = includeAllPaths(r - 1, c, p + "U", maze);
            ans.addAll(str);
        }
        if(c> 0) {
            str = includeAllPaths(r, c - 1, p + "L", maze);
            ans.addAll(str);
        }
        maze[r][c] = 1;
        return ans;

    }
    
}