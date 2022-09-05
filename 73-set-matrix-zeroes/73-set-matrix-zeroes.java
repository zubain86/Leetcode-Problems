class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i,j;
        boolean rowzero = false;
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
            if(matrix[i][j]==0)
            {
                matrix[0][j] = 0;
                if(i>0)
                    matrix[i][0] = 0;
                else
                    rowzero = true;
            }        
            }
        }
        
        for(i=1;i<rows;i++)
        {
            for(j=1;j<cols;j++)
            {
                if(matrix[i][0]==0||matrix[0][j]==0)
                matrix[i][j] = 0;
            }
        }
        
        if(matrix[0][0]==0)
        {
            for(i=0;i<rows;i++)
            {
                matrix[i][0] = 0;
            }
        }
        
        if(rowzero == true)
        {
            for(j=0;j<cols;j++)
            {
                matrix[0][j] = 0;
            }
        }
        
    }
}