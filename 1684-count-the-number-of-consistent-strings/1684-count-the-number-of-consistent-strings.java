class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       HashSet<Character> set = new HashSet<>();
        int i;
       for(i=0;i<allowed.length();i++)
       {
           char ch = allowed.charAt(i);
           set.add(ch);
       }
        int flag = 0,count = 0;
        for(i=0;i<words.length;i++)
        {
            String temp = words[i];
            int j;
            for(j=0;j<temp.length();j++)
            {
                if(!set.contains(temp.charAt(j)))
                {
                    flag =  1;
                    break;
                }
            }
            if(flag==0)
                count++;
            flag = 0;
        }
        
        return count;
        
    }
}