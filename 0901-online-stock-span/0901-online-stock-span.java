class StockSpanner {
    
    ArrayList<Integer> stock;
    int top;

    public StockSpanner() {
        stock = new ArrayList<>();
        top = -1;
    }
    
    public int next(int price) {
        if(top==-1)
        {
            stock.add(price);
            ++top;
            return 1;
        }
        else
        {
            int point;
            int count = 0;
            for(point=top;point>=0;point--)
            {
                if(stock.get(point)<=price)
                    count++;
                else
                    break;
            }
            
            stock.add(price);
            ++top;
            
            return count+1;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */