class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length-1]<=target)
            return letters[0];
        int start = 0;
        int last = letters.length-1;
        while(start<=last)
        {
            int mid = (start + last)/2;
            if(letters[mid]>target)
                last = mid-1;
            else
                start = mid+1;
        }
        
        return letters[start];
    }
}