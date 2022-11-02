class Solution {
    public int[] sortByBits(int[] arr) {
        int i,j;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(countBits(arr[j+1])<countBits(arr[j]))
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                if((countBits(arr[j+1])==countBits(arr[j])) && (arr[j+1]<arr[j]))
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }
        return arr;
        
    }
    public int countBits(int number)
    {
        String n = Integer.toBinaryString(number);
        int j,count=0 ;
        for(j=0;j<n.length();j++)
        {
            char ch = n.charAt(j);
            if(ch=='1')
                count++;
        }
        return count;
    }
}