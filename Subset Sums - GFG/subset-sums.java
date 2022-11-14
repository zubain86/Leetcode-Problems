//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
          ArrayList<Integer> list = subSum(0,arr,new ArrayList<>());
       Collections.sort(list);
        return list;
    }
    public ArrayList<Integer> subSum(int sum , ArrayList<Integer> num, ArrayList<Integer> ans)
    {
        if(num.isEmpty())
        {
            ans.add(sum);
            return ans;
        }
        int no = num.get(0);
        subSum(sum + no,new ArrayList<>(num.subList(1, num.size())),ans);
        subSum(sum,new ArrayList<>(num.subList(1, num.size())),ans);
        return ans;
    }
}