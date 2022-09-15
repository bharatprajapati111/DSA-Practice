class Solution {
    public boolean checkXMatrix(int[][] mat) 
    {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
               if(i==j || i+j==m-1)   // This is Diagonal.
               {
                    if(mat[i][j]==0)  // Diagonal element must be non-zero
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