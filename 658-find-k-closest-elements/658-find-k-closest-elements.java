class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int first = 0;
        int last = arr.length-1;
        while(last-first+1!=k)
        {
            if(arr[last]-x>=x-arr[first])
            {
                last--;
            }
            else
            {
                first++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(i=first;i<=last;i++)
        {
            list.add(arr[i]);
        }
        return list;
    }
}