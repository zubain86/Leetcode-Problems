class Solution {
    public int[] replaceElements(int[] arr) {
       int i,j;
       for(i=0;i<arr.length;i++)
       {
           if(i==arr.length-1){
               arr[i] = -1;
               break;
           }
           int max = arr[i+1];
           for(j=i+1;j<arr.length;j++)
           {
               if(max<arr[j])
                   max = arr[j];
           }
           
           arr[i] = max;
        }
        
        
        return arr;
    }
}