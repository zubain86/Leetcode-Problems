import java.math.*;
class Solution {
    public String removeDigit(String number, char digit) {
        
        int i;
        BigInteger maxi = new BigInteger("0");
        String s = "";
        for(i=0;i<number.length();i++)
        {
            char ch = number.charAt(i);
            s = "";
            if(i==number.length()-1 && ch==digit)
                s = number.substring(0,i);
            else if(ch==digit)
                s = s + number.substring(0,i)+number.substring(i+1);
            if(!(s.isEmpty()))
            {
                BigInteger n = new BigInteger(s);
                maxi = maxi.max(n);
            }
        }
        
        return maxi.toString();
        
    }
}