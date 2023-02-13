class Solution {
    public String decodeString(String s) {
        String ans = "";
        int i;
        Stack<Character> stack = new Stack<>();
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(stack.isEmpty() && Character.isLetter(ch))
                ans+=ch;
           else if(ch!=']')
               stack.push(ch);
            else
            {
                String trg = "";
                while(!Character.isDigit(stack.peek()))
                {
                    char c = stack.pop();
                    if(c!='[')
                        trg = c + trg;
                }
                String num = "";
                while(!stack.isEmpty() && Character.isDigit(stack.peek()))
                 num = stack.pop() + num;
                String a = helper(trg,num);
                if(stack.isEmpty())
                    ans+=a;
                else
                {
                    int j;
                    for(j=0;j<a.length();j++)
                    {
                        char chh = a.charAt(j);
                        stack.push(chh);
                    }
                }
            }
            System.out.println(stack);
        }
        
        return ans;
    }
    public String helper(String s, String num)
    {
        String ans = "";
        int n = Integer.parseInt(num);
        int i;
        for(i=0;i<n;i++)
            ans+=s;
        return ans;
    }
}