class Solution {
    public int sumOfMultiples(int n) {
        int i,sum = 0;
        for(i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
                sum += i;
        }
        
        return sum;
        
    }
}