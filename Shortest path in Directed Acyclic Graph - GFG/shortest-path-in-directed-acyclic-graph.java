//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    class Pair 
    {
        int node;
        int weight;
        Pair(int node, int weight)
        {
            this.node = node ;
            this.weight = weight;
        }
    }
    
    public void topo(int node,ArrayList<ArrayList<Pair>> adj,int[] vis,Stack<Integer> s )
    {
        vis[node] = 1;
        for(Pair o:adj.get(node))
        {
            int neigh = o.node;
            if(vis[neigh]==0)
            topo(neigh,adj,vis,s);
        }
        
        s.push(node);
    
     }
	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		//Building a graph
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		for(int i=0;i<N;i++) 
		adj.add(new ArrayList<>());
		for(int i=0;i<edges.length;i++)
		{
		    int node1 = edges[i][0];
		    int node2 = edges[i][1];
		    int wt = edges[i][2];
		    Pair o = new Pair(node2,wt);
		    adj.get(node1).add(o);
		}
		
		Stack<Integer> s = new Stack<>();
		int[] vis = new int[N];
		for(int i=0;i<N;i++)
		{
		    if(vis[i]==0)
		    {
		        topo(i,adj,vis,s);
		    }
		}
		
	 int[] dist = new int[N];
	 for(int i=0;i<N;i++)
	 dist[i] = (int)Math.pow(10,9);
	 dist[0] = 0;
	 
	 while(!s.isEmpty())
	 {
	     int node = s.pop();
	     for(Pair o : adj.get(node))
	     {
	         int neigh = o.node;
	         int dis = o.weight;
	         if(dist[node]+dis<dist[neigh])
	         dist[neigh] = dist[node]+dis;
	     }
	 }
	 
	 for(int i=0;i<N;i++)
	 {
	     if(dist[i]==(int)Math.pow(10,9))
	     dist[i] = -1;
	 }
	 
	 return dist;
		
	}
}