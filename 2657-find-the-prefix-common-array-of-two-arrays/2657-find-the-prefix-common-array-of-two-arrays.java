class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        HashSet<Integer> set = new HashSet<>();
        int i;
        for(i=0;i<A.length;i++)
        {
            if(A[i]==B[i])
            {
                if(i>0)
                res[i] = res[i-1] + 1;
                else
                    res[i] = 1;
            }
            else
            {
                int count = 0;
                if(set.contains(A[i]))
                    count++;
                if(set.contains(B[i]))
                    count++;
                if(i>0)
                    res[i] = res[i-1] + count;
                else
                    res[i] = count;
            }
            set.add(A[i]);
            set.add(B[i]);
        }
        
        return res;
        
    }
}