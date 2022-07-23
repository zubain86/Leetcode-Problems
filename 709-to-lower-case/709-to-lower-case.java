class Solution {
    public String toLowerCase(String s) {
        String m = "";
        for(int i = 0;i<s.length();i++)
        {
            char c = Character.toLowerCase(s.charAt(i));
            m = m + c;
        }
        return m;
    }
}