class MinStack {
    
    Stack<Integer> stack;
    TreeMap<Integer,Integer> map;
    
    public MinStack() {
        stack = new Stack<>();
        map = new TreeMap<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(!map.containsKey(val))
            map.put(val,1);
        else
        {
            int c = map.get(val)+1;
            map.put(val,c);
        }
    }
    
    public void pop() {
        int top = stack.pop();
        int x  = map.get(top);
        if(x>1)
        {
           map.put(top,x-1);
        }
        else
        {
            map.remove(top);
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return map.firstKey();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */