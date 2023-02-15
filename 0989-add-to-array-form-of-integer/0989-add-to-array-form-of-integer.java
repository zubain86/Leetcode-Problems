import java.math.BigInteger;  
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String s = "";
        for(int i : num)
            s+=i;
        BigInteger n = new BigInteger(s);
        BigInteger kth = new BigInteger(Integer.toString(k));
        BigInteger r = n.add(kth);
        String res = r.toString();
        int i;
        List<Integer> list = new ArrayList<>();
        for(i=0;i<res.length();i++)
        {
            char ch = res.charAt(i);
            list.add(Character.getNumericValue(ch));
        }
     return list;   
    }
}