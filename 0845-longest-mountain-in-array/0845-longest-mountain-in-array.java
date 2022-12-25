class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3)
            return 0;
        int i,max = 0;
        for(i=1;i<arr.length-1;i++)
        {
            int f = i;
            int l = i;
            while(f>0 && arr[f-1]<arr[f])
                f--;
            while(l<arr.length-1 && arr[l+1]<arr[l])
                l++;
            int res = 0;
            if(f!=i && l!=i)
                res = l-f+1;
            if(res>max)
                max = res;
        }
        return max;
    }
}