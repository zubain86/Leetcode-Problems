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
        Integer[] list = map.values().toArray(new Integer[map.size()]);
        int gcd = list[0];
        for(i=1;i<list.length;i++ )
        {
              gcd = GCD(gcd,list[i]);       
        }
       if(gcd==1)
           return false;
        else 
            return true;
        
    }
  
    public int GCD(int n1, int n2)
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