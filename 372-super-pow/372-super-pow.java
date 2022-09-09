import java.math.BigInteger;
class Solution {
    public int superPow(int a, int[] b) {
        int i;
        String m = "";
        for(i=0;i<b.length;i++)
        {
            m = m + b[i];
        }
        BigInteger exp = new BigInteger(m);
        BigInteger base = new BigInteger(Integer.toString(a));
        BigInteger mod = new BigInteger("1337");
        BigInteger result = base.modPow(exp,mod);  
        return result.intValue();
        
    }
}