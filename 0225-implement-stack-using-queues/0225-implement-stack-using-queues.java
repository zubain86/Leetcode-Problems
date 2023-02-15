class MyStack {
    
    List<Integer> queue;
    int f;
    int r;
    public MyStack() {
        queue = new LinkedList<>();
        r = -1;
        f = -1;
    }
    
    public void push(int x) {
        ++r;
        queue.add(x);
    }
    
    public int pop() {
        int x = queue.remove(r);
        r--;
        return x;
    }
    
    public int top() {
        int x = queue.get(r);
        return x;
    }
    
    public boolean empty() {
        if(r==-1)
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */