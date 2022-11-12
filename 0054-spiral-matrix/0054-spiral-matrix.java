class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> list = new ArrayList<>();
        int r = matrix.length-1;
        int c = matrix[0].length-1;
        int i = 0;
        int j = 0;
        int k = 0;
        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        int f4 = 0;
        while(i<=r && j<=c)
        {
            while(j<=c-k)
            {
                list.add(matrix[i][j]);
                j++;
                f1 = 1;
            }
            if(f1==0)
                break;
            i++;
            j = c-k;
            while(i<=r-k)
            {
                list.add(matrix[i][j]);
                i++;
                f2 = 1;
            }
            if(f2== 0)
                break;
            i = r-k;
            j = c-k-1;
            while(j>=k)
            {
                list.add(matrix[i][j]);
                j--;
                f3 = 1;
            }
            if(f3==0)
                break;
            i = r-k-1;
            j=k;
            while(i>k)
            {
                list.add(matrix[i][j]);
                i--;
                f4 = 1;
            }
            if(f4 == 0)
                break;
            System.out.println(list);
            k++;
            i = 0;j = 0;
            i = i + k;
            j = j + k;
            f1 = 0;
            f2 = 0;
            f3 = 0;
            f4 = 0;
        }
        return list;
        
    }
}