import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        
        BigInteger b1 = new BigInteger(a,2);
        BigInteger b2 = new BigInteger(b,2);
        BigInteger sum = b1.add(b2);       
        return sum.toString(2);
      
}}
