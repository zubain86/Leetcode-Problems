class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    
    public void reverse(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}