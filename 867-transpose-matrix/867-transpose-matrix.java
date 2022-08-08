class Solution {
    public int[][] transpose(int[][] matrix) {
         
        int[][] temp = new int[matrix[0].length][matrix.length];
              int i,j;
              for(i=0;i<matrix.length;i++)
              {
                  for(j=0;j<matrix[0].length;j++)
                  {
                      temp[j][i] = matrix[i][j];
                  }
              }
        return temp;
    }
}