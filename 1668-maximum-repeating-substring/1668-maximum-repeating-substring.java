class Solution {
    public int maxRepeating(String sequence, String word) {
        if(!(sequence.contains(word)))
            return 0;
        else
        {
           String temp = word;
            int count = 0 ;
            while(sequence.contains(temp))
            {
                count++;
                temp = temp + word;
            }
            
           
        
        return count;
            
    }
}}