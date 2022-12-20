/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
          
          int start = 0;
          int end = mountainArr.length()-1;
          while(start<end)
          {
              int mid = (start + end)/2;
              if(mountainArr.get(mid)<mountainArr.get(mid+1))
                  start = mid + 1;
              else
                  end  = mid;
          }
         System.out.println(mountainArr.length());
         
          int peak = start;
          int left = search(0,peak,mountainArr,target,0);
          int right = search(peak+1,mountainArr.length()-1,mountainArr,target,1);
    
          int res;
          if(left!=-1 && right!=-1)
          res = Math.min(left,right);
          else 
          res = Math.max(left,right);
          return res;
        
    }
     
    public int search(int s,int l, MountainArray mountain,int target,int c)
    {
        while(s<=l)
        {
            int mid = (s+l)/2;
            if(mountain.get(mid)==target)
                return mid;
            else if(mountain.get(mid)<target)
            {
                if(c==0)
                s = mid + 1;
                else
                    l = mid-1;
            }
            else
            {
                if(c==0)
                l = mid - 1;
                else
                    s = mid + 1;
        }
        }
        
        return -1;
    }
}