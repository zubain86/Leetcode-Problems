class Solution {
    public int[] getStrongest(int[] arr, int k) {
        
       //Sorting a arary 
        Arrays.sort(arr);
        int  median  = arr[(arr.length - 1)/2];
        // Two pointers approach
        int i,j;
        i = 0;
        j = arr.length-1;
        int[]  out = new int[k];
        int ind = 0;
        while(i<=j && k>0)
        {
           if((median - arr[i]) <= (arr[j] - median))
           {
               out[ind++] = arr[j];
               j--;
            }
            else
            {
                out[ind++] = arr[i];
                i++;
            }
            
            k--;
        
        }
         return out;
    }
}