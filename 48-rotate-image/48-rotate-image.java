class Solution {
    public void rotate(int[][] matrix) {
        int i,j;
        int n = matrix.length;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                int temp  = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        int k = n-1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(k>j)
                {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                }
                k--;
            }
            k = n-1;
        }
        
        
      
        
    }
}