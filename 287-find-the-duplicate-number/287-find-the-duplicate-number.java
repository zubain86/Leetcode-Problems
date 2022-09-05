class Solution {
    public int findDuplicate(int[] nums) {
    int rep = sort(nums);
        return rep;

    }
     
        static int sort(int[] arr)
        {
            int i = 0;
            while(i<arr.length){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct])
                   swap(arr,i,correct);
                else if(arr[i]==arr[correct] && i!=correct)
                    return arr[i];
                else
                i++;
            }
            
            return 0;

        }
        static void swap(int[] arr,int first,int last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
        
}