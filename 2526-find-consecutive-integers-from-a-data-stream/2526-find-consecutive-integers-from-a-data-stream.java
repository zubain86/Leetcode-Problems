class DataStream {
    int value,fori = Integer.MAX_VALUE,k;
    int size = 0;
    public DataStream(int value, int k) {
        this.value = value; 
        this.k = k;
    }
    
    public boolean consec(int num) {
        if(size<k)
        {
            size++;

        }
        if(num!=value)
        {
            fori = 0;
        }
        else if(fori<k)
        {
            fori++;
        }
        if(fori==k)
        {
            fori = Integer.MAX_VALUE;
        }
        if(size==k && fori==Integer.MAX_VALUE)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */