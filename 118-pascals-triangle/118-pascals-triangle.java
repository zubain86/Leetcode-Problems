class Solution {
    public List<List<Integer>> generate(int numRows) {
        int i;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(first);
        for(i=1;i<=numRows-1;i++)
        {
            List<Integer> str =  createList(outer.get(i-1));
            outer.add(str);
        }
        
        return outer;
        
    }
    //Function to create inner lists
    static List<Integer> createList(List<Integer> inner)
    {
        List<Integer> list =  new ArrayList<>();
        if(inner.size()==1)
        {
            list.add(1); 
            list.add(1);
        }
        else
        {
            int start = 0;
            int end = 1;
            list.add(1);
            while(end!=inner.size())
            {
                int op = inner.get(start)+inner.get(end);
                list.add(op);
                start++;
                end++;
            }
            list.add(1);
        }
        return list;
    } }