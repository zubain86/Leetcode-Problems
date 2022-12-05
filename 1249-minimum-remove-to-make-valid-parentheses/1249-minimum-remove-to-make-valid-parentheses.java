class Solution {
    public String minRemoveToMakeValid(String s) {
       Stack<Character> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(stack.isEmpty() && ch==')')
                list.add(i);
           else  if(!stack.isEmpty() && stack.peek()=='(' && ch==')') {
                 stack.pop();
                 list.remove(list.size()-1);
             }
            else if(!Character.isLetter(ch)) {
                 stack.push(ch);
                 list.add(i);
             }
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list) {
            set.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!set.contains(i))
                sb.append(ch);
        }
        
          return sb.toString();
}
    }
