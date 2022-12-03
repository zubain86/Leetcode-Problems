class Solution {
    public int addDigits(int num) {
        
        if(num/10==0)
            return num;
        
        int res = 0;
        while(num/10!=0)
        {
            res = add(num);
            num = res;
        }
        
        return res;
     }
    
    public int add(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            int r = n%10;
            sum = sum + r;
            n = n/10;
        }
        
        return sum;
    }
}