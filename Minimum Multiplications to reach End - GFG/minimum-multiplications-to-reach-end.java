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
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    class Pair
    {
        int node;
        int wt;
        Pair(int node, int wt)
        {
            this.node  = node;
            this.wt = wt;
        }
    }
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        // Writing dijkstra algorithm for it 
        PriorityQueue<Pair> q = new PriorityQueue<>((x,y) -> x.wt - y.wt);
        q.offer(new Pair(start,0));
        int[] dist = new int[100000];
        for(int i =0;i<dist.length;i++)
        dist[i] = (int)1e9;
        dist[start] = 0;
        while(!q.isEmpty())
        {
             int node = q.peek().node;
             int d = q.peek().wt;
             q.poll();
             if(node==end) 
             return d;
             for(int i: arr)
             {
                 int nd = (node * i)%100000;
                 int ndist = d + 1;
                 if(d + 1 < dist[nd]){
                 dist[nd] = dist[node] + 1;
                 q.offer(new Pair(nd,ndist));
                 }
                 
             }
             
             
        }
        
        return -1;
    }
}
