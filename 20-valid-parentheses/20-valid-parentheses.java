class Solution {
    public boolean isValid(String s) {
    
        Stack<String> list = new Stack<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            String ch = s.substring(i,i+1);
            if(ch.equals("{")||ch.equals("[")||ch.equals("("))
                list.push(ch);
            else
            {
                 if(list.isEmpty())
                     return false;
                String test = list.peek();
                if(ch.equals("}")&&test.equals("{"))
                    list.pop();
               else if(ch.equals("]")&&test.equals("["))
                    list.pop();
                else if(ch.equals(")")&&test.equals("("))
                    list.pop();
                else
                    return false;
             }
        }
        if(list.isEmpty())
            return true;
        else
            return false;
        
        
    }
}