class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long sum = 0;
        long mul;
        for(mul = 1;add(n)>target;mul*=10)
        {
            sum+= mul * (10-n%10);
            n = n/10 + 1;
        }
        return sum;
        
    }
    public long add(long n)
    {
        long sum = 0;
        while(n>0)
        {
            long rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        
        return sum;
    }
}