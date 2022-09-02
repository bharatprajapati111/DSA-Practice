class Solution {
    public int uniquePathsWithObstacles(int[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        
        if(grid[0][0]==1) //if we have obstacle on starting position then there's no way to go
            return 0;
        
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0) //its prev cell was obstacle or if currennt cell is obstacle
                {
                    if(grid[i][j] == 1 || 
                       (i!=0 && grid[i-1][0]==0) || 
                       (j!=0 && grid[i][j-1]==0))
                    {
                        grid[i][j]=0;
                    }
                    else
                    {
                        grid[i][j]=1;
                    }
                }
                //ALL the other cells
                else
                {
                    if(grid[i][j]==1)
                    {
                        grid[i][j]=0;
                    }
                    else
                    {
                        grid[i][j]=grid[i-1][j]+grid[i][j-1];
                    }
                }
            }
        }
        return grid[m-1][n-1];
    }
}