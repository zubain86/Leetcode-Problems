class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
         String a =  Character.toString(c);
            list1.add(a);
        }
        for(int i = 0;i<t.length();i++)
        {
            char c = t.charAt(i);
          String b = Character.toString(c);
            list2.add(b);
        }
        if(list1.size()==list2.size())
        {
        Collections.sort(list1);
        Collections.sort(list2);
        for(int i = 0;i<list1.size();i++)
        {
            String a = list1.get(i);
            String b = list2.get(i);
            if(a.equals(b))
                continue;
            else
                return false;
        }
        return true;
        
    }
    else
    return false;
    
}}