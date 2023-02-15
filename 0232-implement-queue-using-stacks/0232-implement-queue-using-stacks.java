class MyQueue {
    Stack<Integer> queue;
    Stack<Integer> temp;
    public MyQueue() {
        queue = new Stack<>();
        temp =  new Stack<>();
    }
    
    public void push(int x) {
         while(!queue.isEmpty())
         {
             int y = queue.pop();
             temp.push(y);
         }
         queue.push(x);
         while(!temp.isEmpty())
         {
             int y = temp.pop();
             queue.push(y);
         }
    }
    
    public int pop() {
        
        return queue.pop();
        
    }
    
    public int peek() {
          return queue.peek();
    }
    
    public boolean empty() {
        if(queue.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */