class Solution {
    public boolean checkPerfectNumber(int num) {
         int i;
            int sum = 0;
             if(num==1)
                 return false;
            for(i=2;i*i<=num;i++)
            {
                if(num%i==0)
                {
                    sum = sum + i;
                    sum = sum + (num/i);
                }
                
            }
            if(sum+1==num)
            {
                return true;
            }
            else
            {
                return false;
            }
        
        
    }
}