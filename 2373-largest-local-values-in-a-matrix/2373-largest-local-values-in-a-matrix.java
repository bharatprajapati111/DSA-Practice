class Solution 
{
    public int[][] largestLocal(int[][] grid) 
    {
        int [][]maxLocal=new int[grid.length-2][grid.length-2];
        for(int i=0;i<maxLocal.length;i++)
        {
            for(int j=0;j<maxLocal.length;j++)
            {
                int max = Integer.MIN_VALUE;
                for (int row = i; row < i + 3; ++row) 
                {
                    for (int column = j; column < j + 3; ++column) 
                    {
                        max = Math.max(max, grid[row][column]);
                    }
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}