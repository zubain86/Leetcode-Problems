class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++)
        {
             if(!map.containsKey(tasks[i]))
             {
                 map.put(tasks[i],1);
             }
            else
            {
                int c = map.get(tasks[i])+1;
                map.put(tasks[i],c);
            }
        }
        
        int min = 0;
        
        for(Integer i:map.values())
        {
            if(i/2==0)
                return -1;
            else
            {
                int r = i%3;
                int q = i/3;
                int curr = 0;
                if(r==0)
                    min+= q;
                else
                    min+= q+1;
                    
            }
        }
        
        return min;
    }
}