class Solution {
    public boolean halvesAreAlike(String s) {
       s = s.toLowerCase();
       int  n = s.length()/2;
       HashSet<Character> set = new HashSet<>();
       set.add('a');
       set.add('e');
       set.add('i');
       set.add('o');
       set.add('u');
       int count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(set.contains(ch))
            count1++;
        }
        for (int i = n; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch))
            count2++;
        }
        if(count1 == count2)
             return true;
        else
            return false;
    
    }
}