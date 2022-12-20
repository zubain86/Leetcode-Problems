class Solution {
    public int search(int[] nums, int target) {
        
        int pivot = findPivot(nums);
        int left = search(0,pivot,nums,target);
        if(left!=-1)
            return left;
        int right = search(pivot+1,nums.length-1,nums,target);
        if(right!=-1)
            return right;
        return -1;
        
    }
    
    public int search(int s, int l, int[] arr, int target)
    {
           while(s<=l)
           {
               int mid = (s+l)/2;
               if(arr[mid] == target)
                   return mid;
               else if(arr[mid]>target)
                   l = mid - 1;
               else
                   s = mid + 1;
           }
        return -1;
    }
    
    public int findPivot(int [] arr)
    {
            int start = 0;
            int end = arr.length-1;
            while(start<=end)
            {
             int mid = (start + end)/2;
             if(mid < end && arr[mid]>arr[mid+1]) {
                 return mid;
             }
             else if(mid>start && arr[mid]<arr[mid-1])
             {
                 return mid - 1;
             }
             else
             {
                 if(arr[start]>arr[mid])
                     end = mid - 1;
                 else
                     start = mid + 1;
             }
            }            
            return -1;
    
}
}