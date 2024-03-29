class Solution {
    public int smallestValue(int n) {
        
        ArrayList<Integer> list = sieve(n);
        int i,sum=0,number = 1;
        
        while(number!=n)
        {
            number = n;
            sum = 0;
            for(i=0;i<list.size() && list.get(i)<=n ;i++)
        {
            if(n%list.get(i)==0)
            {
                sum = sum + list.get(i);
                n = n/list.get(i);
                i = -1;
            }
                
        }
        n = sum;
        }
        return n;
    }
    
    public ArrayList<Integer> sieve(int n)
    {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        int i,j;
        for(i = 2; i*i<=n; i++)
        {
             for(j=2*i; j<=n; j+=i)
             {
                 isPrime[j] = false;
             }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(i=0;i<isPrime.length;i++)
        {
            if(isPrime[i]==true)
                list.add(i);
        }
        
        return list;
    }
}