class Solution {
    public char findTheDifference(String s, String t) {
       ArrayList<Character> s1 = new ArrayList<>();
        for(char i:s.toCharArray())
            s1.add(i);
         ArrayList<Character> t1 = new ArrayList<>();
        for(char i:t.toCharArray())
            t1.add(i);
        Collections.sort(s1);
        Collections.sort(t1);
        int l1 = s1.size();
        int l2 = t1.size();
        if(l1<l2)
            return computeDifference(t1,s1);
        else
            return computeDifference(s1,t1);
        
    }
    public static char computeDifference(ArrayList<Character> larg,ArrayList<Character> small)
    {
        for(int i = 0;i<small.size();i++)
        {
            if(larg.get(i)!=small.get(i))
                return larg.get(i);
        }
        return larg.get(larg.size()-1);
    }
}