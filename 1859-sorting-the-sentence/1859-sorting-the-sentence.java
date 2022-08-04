class Solution {
    public String sortSentence(String s) {
        String a[] = s.split(" ");
        String b[] = new String[a.length+1];
        for(int i=0;i<a.length;i++)
        {
            String m = a[i];
            char ch = m.charAt(m.length()-1);
            int num = Character.getNumericValue(ch);
            b[num] = m.substring(0,m.length()-1);
        }
        String res = "";
        for(int i=1;i<b.length;i++)
        {
        res = res + b[i] + " ";
        }
        return res.trim();
    }
}