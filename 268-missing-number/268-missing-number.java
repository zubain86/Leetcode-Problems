class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        int i;
        for(i=0;i<nums.length;i++){
        if(nums[i]!=i)
            return i;
        }
        return nums.length;
        
        
    }
        
        
        
        static void sort(int[] arr)
        {
            int i = 0;
            while(i<arr.length){
                if(arr[i]==arr.length){
                    i++;
                    continue;
                }
                int correct = arr[i];
                if(arr[i]!=arr[correct])
                   swap(arr,i,correct);
                else
                i++;
            }

        }
        static void swap(int[] arr,int first,int last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
        
    
}