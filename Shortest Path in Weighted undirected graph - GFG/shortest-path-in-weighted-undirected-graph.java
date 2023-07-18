//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
@SuppressWarnings("unchecked") class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int edges[][] = new int[m][3];
            for (int i = 0; i < m; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
                edges[i][2] = sc.nextInt();
            }
            Solution obj = new Solution();
            List<Integer> ans = obj.shortestPath(n, m, edges);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static class Pair
    {
        int node;
        int wt;
        Pair(int node, int wt)
        {
            this.node = node;
            this.wt = wt;
        }
    }
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        // code here
        //let's try to build a graph
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int len = n + 1;
        for(int i = 0;i<len;i++)
        adj.add(new ArrayList<>());
        
        for(int [] i:edges)
        {
            adj.get(i[0]).add(new Pair(i[1],i[2]));
             adj.get(i[1]).add(new Pair(i[0],i[2]));
        }
        
        PriorityQueue<Pair> q = new PriorityQueue<>((x,y)->x.wt-y.wt);
        int[] dist = new int[len];
        int[] memo = new int[len];
        
        for(int i = 0;i<len;i++)
        dist[i] = (int)1e9;
        dist[1] = 0;
        
        q.offer(new Pair(1,0));
        memo[1] =1;
        while(!q.isEmpty())
        {
            Pair o = q.peek();
            int node = o.node;
            int distance = o.wt;
            q.poll();
            for(Pair i:adj.get(node))
            {
                int v = i.node;
                int d = i.wt;
                if(distance + d < dist[v])
                {
                    dist[v] = distance + d;
                    q.offer(new Pair(v,distance + d));
                    memo[v] = node;
                }
            }
        }
        List<Integer> ls = new ArrayList<>();
        if(dist[n]==(int)1e9){
            ls.add(-1);
            return ls;
        }
        int node = n;
        while(memo[node]!=node)
        {
            ls.add(0,node);
            node = memo[node];
        }
        ls.add(0,1);
        return ls;
        
    }
}