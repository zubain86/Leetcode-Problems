class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] str = s.split(" ");
        char[] ch = pattern.toCharArray();
        int i;
        if(str.length!=ch.length)
            return false;
        for(i = 0;i<str.length;i++)
        {
            if(!map.containsKey(ch[i]))
            {
                if(map.values().contains(str[i]))
                    return false;
                 
                map.put(ch[i],str[i]);
            
            }    
            else
            {
                String temp = map.get(ch[i]);
                if(!temp.equals(str[i]))
                    return false;
            }  
        }
        
        return true;
         
    }
}