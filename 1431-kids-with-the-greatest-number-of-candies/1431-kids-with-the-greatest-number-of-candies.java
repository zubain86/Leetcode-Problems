class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> tell = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();

        for (int j : candies)
            copy.add(j);
        int max = Collections.max(copy);

        int i;
        for(i=0;i<candies.length;i++)
        {
            int con = candies[i];
            int res = con + extraCandies;
            if(res>=max)
                tell.add(true);
            else
                tell.add(false);
        }
        
        return tell;
        
    }
}