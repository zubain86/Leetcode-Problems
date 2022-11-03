class Solution {
    public boolean rotateString(String s, String goal) {
        String m = s;
        int flag = 0;
        do
        {
            s = left(s);
            if(s.equals(goal))
            {
                flag=1;
                 break;
            }
            
        }
        while(!(s.equals(m)));
        if(flag==1)
            return true;
        else
            return false;
        
    }
     public static String left(String str)
    {
        String m = "";
        m = m + str.substring(1,str.length()-1) + str.charAt(str.length()-1) + str.charAt(0);
                return m;
    }
}