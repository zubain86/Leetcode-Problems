class Solution {
    public int minimumCost(int[] cost) {
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(Integer j:cost)
        {
            list.add(j);
        }
        Collections.sort(list);
        int count = 0;
        int sum = 0;
        for(i=list.size()-1;i>=0;i--)
        {
            if(count!=2)
            {
                sum = sum + list.get(i);
                count++;
            }
            else
            {
                count = 0;
            }
        }
        return sum;
        
    }
}