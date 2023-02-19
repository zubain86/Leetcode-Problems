class LRUCache {
    
    int capacity;
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        else
        {
            Node node = map.get(key);
            int value = node.val;
            remove(node);
            Node new_node = new Node(key,value);
            insert(new_node);
            map.put(key,new_node);
            return value;
        }
        
    }
    
    public void put(int key, int value) {
        if(map.size()==capacity && !map.containsKey(key))
        {
            map.remove(tail.prev.key);
            remove(tail.prev);
            Node node = new Node(key,value);
            insert(node);
            map.put(key,node);
        }
        else
        {
            if(!map.containsKey(key))
            {
                Node node = new Node(key,value);
                insert(node);
                map.put(key,node);
            }
            else
            {
                remove(map.get(key));
                Node node = new Node(key,value);
                insert(node);
                map.put(key,node);
            }
        }
        
    }
    public void remove(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;
    }
    public void insert(Node node)
    {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    class Node
    {
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key,int val)
        {
            this.val = val;
            this.key = key;
            prev = null;
            next = null;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */