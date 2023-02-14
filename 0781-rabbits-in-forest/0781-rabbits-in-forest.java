class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i;
        for(i=0;i<answers.length;i++)
        {
            if(!map.containsKey(answers[i]))
                map.put(answers[i],1);
            else
            {
                int c = map.get(answers[i]) + 1;
                map.put(answers[i],c);
            }
        }
        int min = 0;
        for(Integer key : map.keySet())
        {
             int c = key + 1;
             int q = map.get(key)/c;
             int r = map.get(key)%c;
             int res = q*c;
            if(r!=0)
                res+=c;
            min+=res;
        }
        return min;
        
    }
}