class Solution {
    public boolean isSameAfterReversals(int num) {
        String s = Integer.toString(num);
        StringBuilder m = new StringBuilder(s);
        m.reverse();
        String rev = m.toString();
        int num1 = Integer.parseInt(rev);
        String revv = Integer.toString(num1);
        StringBuilder p = new StringBuilder(revv);
        p.reverse();
        String drev = p.toString();
        if(s.equals(drev))
            return true;
        else
            return false;
        
    }
}