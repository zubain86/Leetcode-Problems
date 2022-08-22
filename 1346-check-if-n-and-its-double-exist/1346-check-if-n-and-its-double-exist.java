class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = i+1;
        while(i<arr.length-1)
        {
            if(arr[j]==arr[i]*2)
                return true;
            if(arr[i]==arr[j]*2)
                return true;
            
            if(j==arr.length-1)
            {
                i++;
                j = i+1;
            }
            else
            j++;
        }
        return false;
    }
}