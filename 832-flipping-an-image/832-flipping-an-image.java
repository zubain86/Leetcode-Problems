class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] nimage = new int[n][n];
        int i,j;
        int l = n-1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                nimage[i][l--] = image[i][j];
            }
            l = n-1;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(nimage[i][j]==1)
                    nimage[i][j] = 0;
                else
                    nimage[i][j] = 1;
            }
        }
        return nimage;
        
    }
}