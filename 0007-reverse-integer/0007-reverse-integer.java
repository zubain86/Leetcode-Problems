class Solution {
    public int reverse(int x) 
    {
        int flag = 0;
        if(x<0)
        flag=1;
        int num = Math.abs(x);
        int revnum = 0;
        while(num>0)
        {
            long add = (long)revnum * 10;
            if(add>2147483647l)
                return 0;
            revnum = (int)add  + num%10;
            num/= 10;
        }
        
        
        if (flag==1)
            return -revnum;
         else
             return revnum;
       
    }
}