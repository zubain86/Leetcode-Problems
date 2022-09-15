class Solution {
    public String reverseOnlyLetters(String s) {
        String m = "";
        String a = "";
       int i;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                m = m + ch;
        }
        System.out.println(m);
        StringBuilder sb = new StringBuilder(m);
        sb.reverse();
        String rev = sb.toString();
        System.out.println(rev);
        int j = 0;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                a = a + rev.charAt(j);
                j++;
            }
                else
                a = a + ch;
        }
        
        return a;
    }
}