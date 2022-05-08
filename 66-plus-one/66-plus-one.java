import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        String s = "";
        for(i=0;i<digits.length;i++)
        {
            s = s+digits[i];
        }
        BigInteger num = new BigInteger(s);
        BigInteger new_num = num.add(new BigInteger("1"));
        String new_s = new_num.toString();
        int [] digit = new int[new_s.length()];
        for(i=0;i<new_s.length();i++)
        {
            char c = new_s.charAt(i);
            int cnum = Character.getNumericValue(c);
            digit[i] = cnum;
        }
        return digit;
         
    }
}