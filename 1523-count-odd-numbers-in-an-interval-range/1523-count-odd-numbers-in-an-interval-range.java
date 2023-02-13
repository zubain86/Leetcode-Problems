class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        int i;
        if(low%2==0)
            low++;
        for(i=low;i<=high;i+=2)
        {
            count++;
        }
        
        return count;
    }
}