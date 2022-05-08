class Solution {
    public static boolean findRotation(int[][] mat, int[][] target) {
         int i,j,k,temp,flag = 0;
        int n = mat.length;
        for(i=1;i<=4;i++)
        {
            flag = 0;
            for(j=0;j<n;j++)
            {
                for(k=0;k<j;k++)
                {
                    temp = mat[j][k];
                    mat[j][k] = mat[k][j];
                    mat[k][j] = temp;
                }
            }//transpose loop
            for(j=0;j<n/2;j++)
            {
                for(k=0;k<n;k++)
                {
                   temp = mat[j][k];
                   mat[j][k] = mat[n-j-1][k];
                   mat[n-j-1][k] = temp;
                }
            }//Shifting loop
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                   if(mat[j][k]!= target[j][k])
                   {
                       flag = 1;
                       break;
                   }
                }
            }//Checks rotated matrix
            if(flag==0)
            {
                break;
            }//Breaks the loop
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m[][] = new int[n][n];
        int t[][] = new int[n][n];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                m[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                t[i][j] = sc.nextInt();
            }
        }
       
        boolean k =	findRotation(m,t);
        System.out.println(k);      
    }
}

        
