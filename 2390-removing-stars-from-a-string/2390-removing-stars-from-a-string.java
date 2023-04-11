class Solution {
    public String removeStars(String s) {
        
          Stack<Character> stack = new Stack<>();
          for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()=='*' && ch!='*')
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
          }
          String res ="";
          while(!stack.isEmpty())
          {
            char ch = stack.pop();
            res += ch;
          }

          return res;
    }
        
    }
