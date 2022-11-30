class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++)
        {
            if(!(map.containsKey(arr[i])))
                map.put(arr[i],1);
            else
            {
                int count = map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i : map.values())
        {
            if(set.contains(i))
                return false;
            else
                set.add(i);
        }
     
        return true;
    }
}