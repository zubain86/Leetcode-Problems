class Solution {
    public String reverseWords(String s) {
        String[] m = s.split(" ");
        String k = "";
        for (int i = m.length-1; i >=0 ; i--) {
            if(!(m[i].isEmpty()))
            k+= " " + m[i];
        }
        k =  k.trim();
        return k;
    }
}