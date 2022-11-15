class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1 || deck.length==0)
            return false;
        HashMap<Integer,Integer> map = new HashMap();
        int i,count = 1 ;
        for(i=0;i<deck.length;i++)
        {
            if(map.containsKey(deck[i]))
            {
                count = map.get(deck[i]) + 1;
                map.put(deck[i],count);
            }
            else
            {
                map.put(deck[i],count);
            }
            count = 1;
        }
     
        ArrayList<Integer> list = new ArrayList<>();;
        for(Integer j : map.values())
        {
           list.add(j);         
         }
        System.out.println(list);
        int gcd = GCD(list);
       if(gcd==1)
           return false;
        else 
            return true;
        
    }
    public int GCD(ArrayList<Integer> list)
    {
        int i,gcd = list.get(0);
        for(i=1;i<list.size();i++)
        {
            gcd = helper(gcd,list.get(i));
        }
         return gcd;
    }
    public int helper(int n1, int n2)
    { 
         int min = (int)Math.min(n1,n2);
        int i;
        int gcd = 0;
        for(i=1;i<=min;i++)
        {
            if(n1%i==0 && n2%i==0)
                gcd = i;
        }
        
        return gcd;
    }
}