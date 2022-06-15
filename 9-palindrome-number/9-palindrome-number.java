class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String m = sb.toString();
        if(s.equals(m))
            return true;
        else
            return false;
        
    }
}