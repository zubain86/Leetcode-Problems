class Solution {
    public int commonFactors(int a, int b) {
        int j =  Math.min(a,b);
        int count = 0;
        int i;
        for(i=1;i<=j;i++)
        {
            if(a%i==0&&b%i==0)
                count++;
        }
        return count;
    }
}