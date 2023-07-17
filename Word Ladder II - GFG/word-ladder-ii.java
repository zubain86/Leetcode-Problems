//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class comp implements Comparator<ArrayList<String>> {
    // override the compare() method
    public int compare(ArrayList<String> a, ArrayList<String> b)
    {
        String x = "";
        String y = "";
        for(int i=0; i<a.size(); i++)
            x += a.get(i);
        for(int i=0; i<b.size(); i++)
            y += b.get(i);
        return x.compareTo(y);
    }
}

public class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] wordList = new String[n];
            for(int i = 0; i < n; i++){
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<ArrayList<String>> ans = obj.findSequences(startWord, targetWord, wordList);
            if(ans.size()==0)
                System.out.println(-1);
            else
            {
                Collections.sort(ans, new comp());
                for(int i=0; i<ans.size(); i++)
                {
                    for(int j=0; j<ans.get(i).size(); j++)
                    {
                        System.out.print(ans.get(i).get(j) + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord, String[] wordList)
    {
        // Code here
         HashSet<String> set = new HashSet<>(Arrays.asList(wordList));
    Queue<ArrayList<String>> q = new LinkedList<>();
    int level = 0;
    ArrayList<String> start = new ArrayList<>();
    start.add(startWord);
    q.offer(start);
    ArrayList<String> usedlevel = new ArrayList<>();
    usedlevel.add(startWord);
    ArrayList<ArrayList<String>> ans = new ArrayList<>();
    while(!q.isEmpty())
    {
        ArrayList<String> o = q.poll();
        if(o.size()>level)
        {
            level++;
            for(String i:usedlevel)
            set.remove(i);
            usedlevel = new ArrayList<>();
        }
        if(o.get(o.size()-1).equals(targetWord))
        {
            if(ans.size()==0)
            ans.add(o);
            else if(ans.get(ans.size()-1).size()==o.size())
            ans.add(o);
        }
        
        for(int i = 0;i<startWord.length();i++)
        {
            char[] ch = o.get(o.size()-1).toCharArray();
            for(char c='a';c<='z';c++)
            {
                ch[i] = c;
                String ns = new String(ch);
                if(set.contains(ns))
                {
                    ArrayList<String> ls = new ArrayList<>(o);
                    ls.add(ns);
                    q.offer(ls);
                    usedlevel.add(ns);

                }
            }

        }
    }

    return ans;
    }
}