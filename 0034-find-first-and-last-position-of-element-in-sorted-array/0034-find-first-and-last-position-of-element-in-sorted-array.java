class Solution {
    public int[] searchRange(int[] nums, int target) {
        //for first c = 0
        //for second c = 1
        int first = search(0,nums.length-1,nums,target,0);
        int second = search(0,nums.length-1,nums,target,1);
        int[] res = {first,second};
        return res;
         
    }
    
       public int search(int s, int l, int[] nums, int target, int c)
       {
           int ans = -1;
           while(s<=l)
           {
               int mid = (s + l)/2;
               if(nums[mid]==target)
               {
                   ans = mid;
                   if(c==0)
                       l = mid - 1;
                   else
                       s = mid + 1;
               }
               else if(nums[mid]<target)
                   s = mid + 1;
               else
                   l = mid - 1;
           }
           
           return  ans;
       }
}