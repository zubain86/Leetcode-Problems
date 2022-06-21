class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(i=0;i<arr.length;i++)
        {
          list.add(arr[i]);
        }
        int max = list.indexOf(Collections.max(list));
        return max; 
    }
}