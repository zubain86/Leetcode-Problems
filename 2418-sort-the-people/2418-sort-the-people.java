class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        int i;
        String[] s = new String[names.length];
        for(i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int k = 0;
        for(i=heights.length-1;i>=0;i--)
        {
            s[k++] = map.get(heights[i]);
        }
        return s;
        
    }
}