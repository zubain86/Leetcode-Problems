//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // let's try to build dag 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<K;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<N-1;i++)
        {
            String s1 = dict[i];
            String s2 = dict[i+1];
            int len = Math.min(s1.length(),s2.length());
            for(int j=0;j<len;j++)
            {
                if(s1.charAt(j)!=s2.charAt(j))
                {
                    int n1 = s1.charAt(j)-97;
                    int n2 = s2.charAt(j)-97;
                    adj.get(n1).add(n2);
                    break;
                }
            }
        }
        
        return topo(adj);
    }
    
    public String topo(ArrayList<ArrayList<Integer>> adj)
    {
        int len = adj.size();
        int indegree[] = new int[len];
        for(int i=0;i<len;i++)
        {
            for(Integer j:adj.get(i))
            indegree[j]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<len;i++)
        {
            if(indegree[i]==0)
            q.offer(i);
        }
        
        ArrayList<Integer> ls = new ArrayList<>();
        
        while(!q.isEmpty())
        {
            int node = q.poll();
            ls.add(node);
            for(Integer i:adj.get(node))
            {
                indegree[i]--;
                if(indegree[i]==0)
                q.offer(i);
            }
        }
        
        String res = "";
        
        for(Integer i:ls)
        res+= (char)(i+97);
        
        return res;
    }
}