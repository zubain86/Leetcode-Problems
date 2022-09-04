class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        for(int[] arr : intervals)
        {
            list.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        }
        Collections.sort(list , (a,b) -> Integer.compare(a.get(0),b.get(0)));
       List<List<Integer>> output = new ArrayList<>();
        output.add(list.get(0));
        for(List<Integer> arr : list)
        {
            int last = output.get(output.size()-1).get(1);
            if(arr.get(0)<=last)
            {
                output.get(output.size()-1).set(1,((int)Math.max(arr.get(1),last)));
            }
            else
            {
                output.add(arr);
            }
        }
        int i,j;
        i = 0;
        j = 0;
      int[][] ret = new int[output.size()][2];
        for(List<Integer> array : output)
        {
            for(Integer a : array)
            {
                ret[i][j++] = a; 
            }
            i++;
            j = 0;
        }
        return ret;
        
}
}