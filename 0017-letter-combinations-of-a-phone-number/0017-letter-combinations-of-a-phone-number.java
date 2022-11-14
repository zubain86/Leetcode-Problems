class Solution {
    public List<String> letterCombinations(String digits) { 
        ArrayList<String> list = letCom("",digits);
        return list;
        
    }
    
    public ArrayList<String> letCom(String p, String u)
    {
        if(u.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            if(!(p.isEmpty()))
            list.add(p);
            return list;
        }
        ArrayList<String> out = new ArrayList<>();
         int digit = Character.getNumericValue(u.charAt(0));
         if(digit==7)
         {
             for (int i = (digit-2)*3; i < (digit-1)*3 + 1 ; i++) {
                 char c = (char)('a' + i);
                 out.addAll(letCom(p+c,u.substring(1)));
             }
         }
         else if(digit==8)
         {
             for (int i = (digit-2)*3 + 1; i <= (digit-1)*3 ; i++) {
                 char c = (char)('a' + i);
                 out.addAll(letCom(p+c,u.substring(1)));
             }
         }
         else if(digit==9)
         {
             for (int i = (digit-2)*3+1; i <= (digit-1)*3+1 ; i++) {
                 char c = (char)('a' + i);
                 out.addAll(letCom(p+c,u.substring(1)));
             }
         }
         else{
        for (int i = (digit-2)*3; i <(digit-1)*3 ; i++) {
            char c = (char)('a' + i);
            out.addAll(letCom(p+c,u.substring(1)));
        }}
        return out;
    }
}