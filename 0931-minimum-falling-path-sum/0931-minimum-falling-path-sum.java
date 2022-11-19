class Solution {
    public int minFallingPathSum(int[][] matrix) {
        Integer[][] dp  =new Integer[matrix.length][matrix[0].length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            min = Math.min(calcSum(0,i,matrix,dp),min);
        }
        return min;
    }
   public int calcSum(int r,int c,int[][] matrix, Integer[][] dp) {

        if (r == matrix.length - 1) {
            return matrix[r][c];
        }

        if(dp[r][c]!=null)
            return dp[r][c];
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(c>0)
         left = matrix[r][c] + calcSum(r + 1, c - 1, matrix,dp);
        if(c< matrix[0].length-1)
        right = matrix[r][c] + calcSum(r+1,c+1,matrix,dp);
        int mid = matrix[r][c] + calcSum(r+1,c,matrix,dp);

        int res = Math.min(mid,Math.min(left,right));
        return dp[r][c] = res;
     }
}