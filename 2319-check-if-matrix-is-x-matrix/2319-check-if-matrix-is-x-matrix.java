class Solution {
    public boolean checkXMatrix(int[][] mat) 
    {
        int m=mat.length;
        int n=mat[0].length;
        int count=0;
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
               if(i==j || i+j==m-1)
               {
                    if(mat[i][j]==0)
                    {
                        return false;
                    }
               }
                else if(mat[i][j] != 0) //Non-Diagonal elememt must be zero.
                {
                     return false;
                }   
                    
            }
        }
        return true;

    }
}