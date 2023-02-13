class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer,Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
         this.nums1 = nums1;
         this.nums2 = nums2;
         
        int i;
        int count = 0;
        for(i=0;i<nums2.length;i++)
        {
            if(!map.containsKey(nums2[i]))
                map.put(nums2[i],1);
            else{
                int c = map.get(nums2[i]) + 1; 
                map.put(nums2[i],c);
                }
        }
    }
    
    public void add(int index, int val) {
        int c = map.get(nums2[index])-1;
        map.put(nums2[index],c);
        nums2[index] += val;
        if(map.containsKey(nums2[index]))
        {
            c = map.get(nums2[index]) + 1;
            map.put(nums2[index],c);
        }
        else
        {
            map.put(nums2[index],1);
        }
        
    }
    
    public int count(int tot) {
        int i;
        int count = 0;
        for(i=0;i<nums1.length;i++)
        {
            if(map.containsKey(tot-nums1[i]))
                count+= map.get(tot-nums1[i]);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */