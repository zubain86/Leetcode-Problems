class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i,j;
        List<Integer> list = new ArrayList<>();
        
        for(i=0;i<nums1.length;i++)
        {
            for(j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    list.add(nums1[i]);
                    
                }
               }
        }
        Set<Integer> newlist = new HashSet<>();
        for(i=0;i<list.size();i++)
        {
            newlist.add(list.get(i));
        }
        j = 0;
        int n = newlist.size();
        
        int arr[] = new int[n];
        for(int k: newlist)
        {
           arr[j++] = k;
            }
        return arr;
}}